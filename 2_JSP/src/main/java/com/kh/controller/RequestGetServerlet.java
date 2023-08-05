package com.kh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestGetServerlet
 */
@WebServlet("/confirmPizza.do")
public class RequestGetServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestGetServerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName"); 
		String phone = request.getParameter("phone"); 
		String address = request.getParameter("address"); 
		String message = request.getParameter("message"); 
		
		String[] topping = request.getParameterValues("topping");
		String[] side = request.getParameterValues("side"); 
		
		System.out.println("userName : " + userName);
		System.out.println("phone : " + phone);
		System.out.println("address : " + address);
		System.out.println("message : " + message);
		
		if(topping == null) {
			System.out.println("topping : 없음");
		} else {
			System.out.println("topping : " + String.join("/", topping));
		}
		
		
		if(side == null) {
			System.out.println("side : 없음");
		} else {
			System.out.println("side : " + String.join("/", side));
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
