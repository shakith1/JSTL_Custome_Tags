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
    private String scope;

    public void setScope(String scope) {
        this.scope = scope;
    }

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
            if (scope != null && !scope.isEmpty()) {
                switch (scope) {
                    case "application":
                        pageContext.setAttribute(var, value1 * value2, pageContext.APPLICATION_SCOPE);
                        break;
                    case "session":
                        pageContext.setAttribute(var, value1 * value2, pageContext.SESSION_SCOPE);
                        break;
                    case "page":
                        pageContext.setAttribute(var, value1 * value2);
                        break;
                    case "request":
                        pageContext.setAttribute(var, value1 * value2,pageContext.REQUEST_SCOPE);
                        break;
                }
            } else {
                pageContext.setAttribute(var, value1 * value2);
            }

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
