package com.superMarket.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.superMarket.dao.SuperMarketDAO;
import com.superMarket.dto.Stationary;

@WebServlet("/updateStationary")
public class updateStationaryViewController extends HttpServlet{

	List<Stationary> stationaries;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		stationaries = SuperMarketDAO.getInstance().getAllStationary();
		
		req.setAttribute("list", stationaries);
		req.getRequestDispatcher("updateStationary.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		int count = Integer.parseInt(req.getParameter("count"));
		
		
		String msg=SuperMarketDAO.getInstance().updateStationary(id,count);
		stationaries = SuperMarketDAO.getInstance().getAllStationary();
		
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("addStationary.jsp").forward(req, resp);
	}
}
