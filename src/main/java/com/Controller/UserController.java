package com.Controller;

import com.Model.Post;
import com.Model.User;
import com.Services.AuthenticationService;
import com.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UserController {
    @Autowired
    private PostService postservice;

    @Autowired
    private AuthenticationService authenticationService;

   @RequestMapping("users/login")
    public String login(){
        return "users/login";
    }

    @RequestMapping(value="users/login", method = RequestMethod.POST)
    public String loginUser(User user){
       if(authenticationService.authentication(user)) {
           return "redirect:/posts";
       }
       else{
           return "users/login";
       }
    }

    @RequestMapping(value="users/logout", method = RequestMethod.POST)
    public String logout(Model model){
       ArrayList<Post> posts = postservice.getAllPosts();
       model.addAttribute("posts",posts);
        return "index1";
    }
    @RequestMapping("users/registration")
    public String registration(){
       return "users/registration";
    }

    @RequestMapping(value="users/registration",method= RequestMethod.POST)
    public String userRegistration(User user){

       return "users/login";
    }

}
