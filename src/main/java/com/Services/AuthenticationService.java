package com.Services;

import com.Model.User;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authentication(User user){
        if(user.getUsername().equals("validuser")){
            return true;
        }
        else{
            return false;
        }
    }
}
