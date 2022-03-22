package com.kgc.pojo;

import com.kgc.dao.Ink;
import com.kgc.dao.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class Printer implements Serializable {
    @Autowired
    @Qualifier("inkColor")
    private Ink ink;

    @Autowired
    @Qualifier("pA4")
    private Paper paper;

    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Printer(Ink ink, Paper paper) {
        this.ink = ink;
        this.paper = paper;
    }

    public Printer() {
    }

    @Override
    public String toString() {
        return "Printer{" +
                "ink=" + ink +
                ", paper=" + paper +
                ", comments=" + comments +
                '}';
    }

    public void showInfo(){
        System.out.println("颜色:"+ink.getColor()+";大小:"+paper.getSize());
        throw new RuntimeException();
    }
}
