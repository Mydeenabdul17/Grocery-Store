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
import com.superMarket.dto.Vegetables;

@WebServlet("/updateveges")
public class updateVegetableViewController extends HttpServlet{

	List<Vegetables> vegetables;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		vegetables = SuperMarketDAO.getInstance().getAllVeg();
		
		req.setAttribute("list", vegetables);
		req.getRequestDispatcher("updateVegetables.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		int count = Integer.parseInt(req.getParameter("count"));
		
		
		String msg=SuperMarketDAO.getInstance().updateVeg(id,count);
		vegetables = SuperMarketDAO.getInstance().getAllVeg();
		
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("updateVegetablesMsg.jsp").forward(req, resp);
	}
}
