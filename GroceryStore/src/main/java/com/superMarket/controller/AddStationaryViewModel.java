package com.superMarket.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.superMarket.dao.SuperMarketDAO;
import com.superMarket.dto.Stationary;

@WebServlet("/AddStationary1")
public class AddStationaryViewModel extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		String item = req.getParameter("item");
		int count = Integer.parseInt(req.getParameter("count"));
		String unit=req.getParameter("unit");
		
		Stationary s=new Stationary();
		
		s.setItem(item);
		s.setCount(count);
		s.setUnit(unit);
		
		SuperMarketDAO.getInstance().addItem(s);
		
		req.setAttribute("msg", "Data saved successfully");
		req.getRequestDispatcher("addStationary.jsp").forward(req, resp);
	}
}
