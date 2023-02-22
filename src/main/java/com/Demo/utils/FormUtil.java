package com.Demo.utils;

import javax.servlet.http.HttpServletRequest;

import com.Demo.model.*;

public class FormUtil {
    public static NewModel toNewModel(HttpServletRequest req) {
        NewModel model = new NewModel();
        model.setPage(Integer.parseInt(req.getParameter("page")));
        model.setMaxPageItem(Integer.parseInt(req.getParameter("maxPageItem")));
        return model;
    }

    public static UserModel toUserModel(HttpServletRequest req) {
        UserModel userModel = new UserModel();
        userModel.setUserName(req.getParameter("userName"));
        userModel.setPassWord(req.getParameter("passWord"));
        return userModel;
    }
}
