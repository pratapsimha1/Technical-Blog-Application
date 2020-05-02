package com.Model;

import java.util.Date;

public class Post {
    private String body;
    private String title;
    private Date date;

    public String getBody(){
        return body;
    }

    public void setBody(String body){
        this.body = body;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
}
