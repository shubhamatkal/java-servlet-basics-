package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		//send redirect (redirecting to some other url)
//		res.sendRedirect("sq?k="+k); better way than this 
		
//		using session
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
//		Using cookie
		Cookie cookie = new Cookie("k", k+ "");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
//		System.out.println("result is "+k);
//		PrintWriter out = res.getWriter();
//		out.println("result is "+ k);
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res); 
	}

}
