package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.mark;
import com.dao.MarkDao;


@WebServlet("/MarksController")
public class MarksController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		String action = request.getParameter("action");
 		
		if(action.equalsIgnoreCase("add")) {
			mark m = new mark();
			m.setEnrollment(request.getParameter("enr"));
			m.setSubject(request.getParameter("sub"));
			m.setTheory(Integer.parseInt(request.getParameter("the")));
			m.setPracticle(Integer.parseInt(request.getParameter("pra")));
			MarkDao.AddMarks(m);
			request.setAttribute("msg", "Marks Added");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
