package com.kgc.dao.impl;

import com.kgc.dao.Paper;
import org.springframework.stereotype.Repository;

@Repository("pA4")
public class PA4 implements Paper {
    @Override
    public String getSize() {
        return "A4";
    }
}
