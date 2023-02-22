package com.Demo.filter;

import com.Demo.model.UserModel;
import com.Demo.utils.SessionUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthorizationFilter implements Filter {

    private ServletContext servletContext;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.servletContext = filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String url = req.getRequestURI();
        if(url.contains("/admin")){
            UserModel userModel = (UserModel) SessionUtil.getInstance().getValue(req, "USERMODEL");
            if(userModel != null){
                if(userModel.getRole().getCode().equals("USER")){
                    resp.sendRedirect(req.getContextPath()+"/trang-chu");
                }else {
                    filterChain.doFilter(servletRequest, servletResponse);
                }
            }else{
                resp.sendRedirect(req.getContextPath()+"/login?action=login");
            }
        } else{
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
