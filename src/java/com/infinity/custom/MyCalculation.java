/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.infinity.custom;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Shakith
 */
public class MyCalculation extends TagSupport {

    private Integer value1;
    private Integer value2;
    private String var;

    public void setVar(String var) {
        this.var = var;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        if (var != null && !var.isEmpty()) {
            pageContext.setAttribute(var, value1 * value2);
        } else {
            try {
                out.print(value1 * value2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return SKIP_BODY;
    }

}
