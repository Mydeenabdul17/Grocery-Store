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

@WebServlet("/showItem")
public class ShowListViewController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Grocery> grocerys = SuperMarketDAO.getInstance().getAll();
		
		req.setAttribute("list", grocerys);
		req.getRequestDispatcher("ShowGrocery.jsp").forward(req, resp);
	}
}
