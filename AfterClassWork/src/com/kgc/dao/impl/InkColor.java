package com.kgc.dao.impl;

import com.kgc.dao.Ink;
import org.springframework.stereotype.Repository;

@Repository("inkColor")
public class InkColor implements Ink {
    @Override
    public String getColor() {
        return "红色";
    }
}
