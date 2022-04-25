/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.com.devdojo.maratonaJsf.filter;

import java.io.IOException;
import javax.inject.Inject;
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
public class LoginFilter implements javax.servlet.Filter{
    @Inject
    private LoginBean loginBean;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
    
        HttpServletRequest req =(HttpServletRequest) arg0;
        HttpServletResponse res = (HttpServletResponse)arg1;
        String url = req.getRequestURL().toString();
         if(url.contains("/restricted")&& loginBean.getEstudante() == null){
             res.sendRedirect(req.getServletContext().getContextPath()+"/login.xhtml");
         }else{
             arg2.doFilter(arg0, arg1);
         }
    }

    @Override
    public void destroy() {
    }

}
