package com.Demo.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Demo.model.NewModel;
import com.Demo.model.UserModel;
import com.Demo.service.ICategoryService;
import com.Demo.service.INewService;
import com.Demo.service.IUserService;
import com.Demo.service.impl.NewService;
import com.Demo.utils.FormUtil;
import com.Demo.utils.SessionUtil;

import java.util.logging.Logger;

@WebServlet(urlPatterns = {"/trang-chu", "/login"})
public class HomeController extends HttpServlet {

    @Inject
    private ICategoryService categoryService;

    @Inject
    private INewService newService;

    @Inject
    private IUserService userService;

    private static final long serialVersionUID = -5260134763152397972L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String action = req.getParameter("action");
        if (action != null && action.equals("login")) {
            req.setAttribute("lStatus", (Object) req.getParameter("lStatus"));
            javax.servlet.RequestDispatcher dispatcher = getServletContext()
                    .getRequestDispatcher("/views/login/login.jsp");
            try {
                dispatcher.forward(req, resp);
            } catch (ServletException | IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if (action != null && action.equals("logout")) {

        } else {
            javax.servlet.RequestDispatcher dispatcher = getServletContext()
                    .getRequestDispatcher("/views/web/home.jsp");
            try {
                dispatcher.forward(req, resp);
            } catch (ServletException | IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //req.setAttribute("categories", categoryService.findAll());
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action != null && action.equals("login")) {
            UserModel userModel = FormUtil.toUserModel(req);
            UserModel userModel1 = new UserModel();
            userModel1 = userService.findByUserNameAndPasswordAndStatus(userModel.getUserName(), userModel.getPassWord(), 1);
            if (userModel1 != null) {
                SessionUtil.getInstance().putValue(req, "USERMODEL", userModel1);
                if (userModel1.getRole().getCode().equals("USER")) {
                    resp.sendRedirect(req.getContextPath() + "/trang-chu");
                } else if (userModel1.getRole().getCode().equals("ADMIN")) {
                    resp.sendRedirect(req.getContextPath() + "/admin-home");
                }
            } else {
                resp.sendRedirect(req.getContextPath() + "/login?action=login&lStatus=0");
            }
        }
    }
}
