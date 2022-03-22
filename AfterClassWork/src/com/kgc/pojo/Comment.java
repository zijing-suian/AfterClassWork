package com.kgc.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class Comment implements Serializable {
    @Value("张三")
    private String username;
    @Value("手痒痒")
    private String content;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Comment(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "username='" + username + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public void showInfo(){
        System.out.println(username+"说:"+content);
    }
}
