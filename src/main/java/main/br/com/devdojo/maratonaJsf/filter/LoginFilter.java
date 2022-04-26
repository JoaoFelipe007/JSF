/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.filter;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.br.com.devdojo.maratonaJsf.bean.loginBean.LoginBean;




/**
 *
 * @author Gestão Tech
 */
public class LoginFilter implements Filter{
    @Inject
    private LoginBean loginBean;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    
        HttpServletRequest req =(HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse)servletResponse;
        String url = req.getRequestURL().toString();
         if(url.contains("/restricted") && loginBean.getEstudante() == null){
             res.sendRedirect(req.getServletContext().getContextPath()+"/faces/login.xhtml");
         }else{
             filterChain.doFilter(servletRequest, servletResponse);
         }
    }

    @Override
    public void destroy() {
    }

}
