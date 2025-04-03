package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
//		Cookie
		int k = 0;
		
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies)
		{
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
//		HttpSession session = req.getSession();
//		int k =(int) session.getAttribute("k");
//		int k = Integer.parseInt(req.getParameter("k"));
		k = k*k;
//		Removing value from session
//		session.removeAttribute("k");
		
		PrintWriter out = res.getWriter();
		out.println("square of sum is "+ k);
		
		
//		int k = (int) req.getAttribute("k");
//		k = k*k;
//		PrintWriter out = res.getWriter();
//		out.println("square of sum is "+ k);
		System.out.println("sq called");
	}
}
