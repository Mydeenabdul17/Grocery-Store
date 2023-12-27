package com.superMarket.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.superMarket.dao.SuperMarketDAO;
import com.superMarket.dto.Grocery;

@WebServlet("/AddItem1")
public class AddItemViewController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		String item = req.getParameter("item");
		int count = Integer.parseInt(req.getParameter("count"));
		String unit=req.getParameter("unit");
		
		Grocery g = new Grocery();
		
		g.setItem(item);
		g.setCount(count);
		g.setUnit(unit);
		
		SuperMarketDAO.getInstance().addItem(g);
		
		req.setAttribute("msg", "Data saved successfully");
		req.getRequestDispatcher("addGrocery.jsp").forward(req, resp);
	}
		

}
