package com.superMarket.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.superMarket.dao.SuperMarketDAO;
import com.superMarket.dto.Grocery;

@WebServlet("/updateGrocery")
public class UpdateItemController extends HttpServlet{

	List<Grocery> grocerys;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		grocerys = SuperMarketDAO.getInstance().getAll();
		
		req.setAttribute("list", grocerys);
		req.getRequestDispatcher("updateGrocery.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		int count = Integer.parseInt(req.getParameter("count"));
		
		
		String msg=SuperMarketDAO.getInstance().updateItem(id,count);
		grocerys = SuperMarketDAO.getInstance().getAll();
		
		req.setAttribute("msg", msg);
		req.setAttribute("list", grocerys);
		req.getRequestDispatcher("updateGrocery.jsp").forward(req, resp);
	}
}
