package com.example.mynews2;

public class News {
    private String title;

    private String content;//可以设成url

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

}
