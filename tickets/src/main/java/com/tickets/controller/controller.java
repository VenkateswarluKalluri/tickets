package com.tickets.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tickets.model.Tickets;
import com.tickets.service.ITicketService;
import com.tickets.service.TicketServiceImp;

/**
 * Servlet implementation class controller
 */
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	List<Tickets> ll=new ArrayList<Tickets>();
		PrintWriter out=response.getWriter();
		ITicketService its= new TicketServiceImp();
	/*	Tickets t=new Tickets();*/
		
		try {
			out.println("enter to get");
			ll=its.retriveTicketService();
		}
		catch(Exception e) {
			System.out.println("exception occur in retrivetickets");
			
		}
		out.println("complete  to get");
		out.println(ll);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ITicketService its= new TicketServiceImp();
		Tickets t=new Tickets();
		int i=0;
		
		try {
		i=its.addTicketService(request);
		}
		catch(Exception e) {
			System.out.println("exception is"+e);
		}
		
		
		
	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ITicketService its= new TicketServiceImp();
		Tickets t=new Tickets();
		
		
		try {
		its.deleteTicketService();	
		}
		catch(Exception e) {
			System.out.println("exception is"+e);
			
		}
	}
	
	
	protected void doPut(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		ITicketService its= new TicketServiceImp();
		try {
			its.updateTicketservice();
		}
		catch(Exception e) {
			System.out.println("exception occur in update"+e);
		}
		
		
	}

}
