package com.kgc.dao.impl;

import com.kgc.dao.Paper;
import org.springframework.stereotype.Repository;

@Repository("pB5")
public class PB5 implements Paper {
    @Override
    public String getSize() {
        return "B5";
    }
}
