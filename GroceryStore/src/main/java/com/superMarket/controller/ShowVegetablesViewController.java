package com.superMarket.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.superMarket.dao.SuperMarketDAO;
import com.superMarket.dto.Vegetables;

@WebServlet("/showVegetables")
public class ShowVegetablesViewController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Vegetables> grocerys = SuperMarketDAO.getInstance().getAllVeg();
		
		req.setAttribute("list", grocerys);
		req.getRequestDispatcher("ShowVegetables.jsp").forward(req, resp);
	}
}
