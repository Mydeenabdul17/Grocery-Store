package com.superMarket.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.superMarket.dao.SuperMarketDAO;
import com.superMarket.dto.Grocery;
import com.superMarket.dto.Vegetables;

@WebServlet("/AddVeg1")
public class AddVegetablesViewController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		String item = req.getParameter("item");
		int count = Integer.parseInt(req.getParameter("count"));
		String unit=req.getParameter("unit");
		
		Vegetables v=new Vegetables();
		
		v.setItem(item);
		v.setCount(count);
		v.setUnit(unit);
		
		SuperMarketDAO.getInstance().addItem(v);
		
		req.setAttribute("msg", "Data saved successfully");
		req.getRequestDispatcher("addVegetables.jsp").forward(req, resp);
	}
}
