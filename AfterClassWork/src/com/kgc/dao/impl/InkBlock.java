package com.kgc.dao.impl;

import com.kgc.dao.Ink;
import org.springframework.stereotype.Repository;

@Repository("inkBlock")
public class InkBlock implements Ink {
    @Override
    public String getColor() {
        return "黑白";
    }
}
