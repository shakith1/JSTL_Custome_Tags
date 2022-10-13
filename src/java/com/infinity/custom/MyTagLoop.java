/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.infinity.custom;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Shakith
 */
public class MyTagLoop extends TagSupport{
    private Integer count;
    private Integer start;

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int doStartTag() throws JspException {
        System.out.println("doStartTag...");
        this.start = 0;
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doAfterBody() throws JspException {
        System.out.println("doAfterBody...");
        if(++start < count)
            return EVAL_BODY_AGAIN;
        return SKIP_BODY;
    }  
}
