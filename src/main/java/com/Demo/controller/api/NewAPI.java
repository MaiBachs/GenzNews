package com.Demo.controller.api;

import com.Demo.model.NewModel;
import com.Demo.model.UserModel;
import com.Demo.service.INewService;
import com.Demo.utils.HttpUtil;
import com.Demo.utils.SessionUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@WebServlet(urlPatterns = {"/api-admin-news"})
public class NewAPI extends HttpServlet {
    @Inject
    private INewService newService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        NewModel newModel = HttpUtil.toModel(NewModel.class, req.getReader());
        newModel = newService.findOne(newModel.getId());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getOutputStream(), newModel);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        NewModel newModel = HttpUtil.toModel(NewModel.class, req.getReader());
        UserModel userModel = (UserModel) SessionUtil.getInstance().getValue(req, "USERMODEL");
        newModel.setCreatedby(userModel.getUserName());
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        newModel.setCreateddate(sdf.format(timestamp));
        newModel = newService.save(newModel);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getOutputStream(), newModel);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        NewModel newModel = HttpUtil.toModel(NewModel.class, req.getReader());
        UserModel userModel = (UserModel) SessionUtil.getInstance().getValue(req, "USERMODEL");
        newModel.setModifiedby(userModel.getUserName());
        newService.update(newModel);
        newModel = newService.findOne(newModel.getId());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getOutputStream(), newModel);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
        resp.setContentType("application/son");
        NewModel newModel = HttpUtil.toModel(NewModel.class, req.getReader());
        newService.delete(newModel.getIds());
    }
}
