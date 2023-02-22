package com.Demo.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Demo.model.NewModel;
import com.Demo.service.INewService;
import com.Demo.constant.SystemConstant;
import com.Demo.utils.FormUtil;

@WebServlet(urlPatterns = { "/admin-new" })
public class NewController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private INewService newService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String type = req.getParameter("type");
			if(type != null && type.equals("edit")){
				javax.servlet.RequestDispatcher dispatcher = getServletContext()
						.getRequestDispatcher("/views/admin/new/edit.jsp");
				try {
					dispatcher.forward(req, resp);
				} catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(type == null){
				NewModel model = FormUtil.toNewModel(req);
				Integer offset = (model.getPage()-1)*model.getMaxPageItem();
				Integer limit = model.getMaxPageItem();
				model.setListResult(newService.findAll(offset, limit));
				model.setTotalItem(newService.getTotalItem());
				model.setTotalPage(model.getTotalItem()/model.getMaxPageItem());
				req.setAttribute(SystemConstant.model, model);
				javax.servlet.RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/admin/new/list.jsp");
				dispatcher.forward(req, resp);
			}
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}
