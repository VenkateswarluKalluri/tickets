package com.tickets.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import com.tickets.model.Tickets;
import com.tickets.service.ITicketService;
import com.tickets.service.TicketServiceImp;

/**
 * Servlet implementation class controller1
 */    
@WebServlet("/controller1")
public class controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ITicketService its= new TicketServiceImp();
		PrintWriter out=response.getWriter();
		List<Tickets> ll=new ArrayList<Tickets>();
		Tickets t=new Tickets();
		

		try {
			out.println("controller1");
			ll=its.retriveTicketService();
		}
		catch(Exception e) {
			System.out.println("exception occur in retrivetickets");
			
		}
		out.println("complte");
		out.println(ll);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String type= request.getParameter("actionType");
		ITicketService its= new TicketServiceImp();
		PrintWriter out=response.getWriter();
		
		
		if(type.equals("addTicket")) {
			
			
			int i=0;
			out.println("enter to add ticket");
			Tickets t=new Tickets();
			
			try {
			i=its.addTicketService(request);
			
			out.println("complete to add ticket");
			
			}
			catch(Exception e) {
				System.out.println("exception is"+e);
			}
			
		}
		else if(type.equals("delete")) {
			
			out.println("enter to delete ticket");
			
			try {
				its.deleteTicketService();
				out.println("complete to one row delete");
				
				}
				catch(Exception e) {
				out.println("exception is"+e);
					
				}
			
		}
		else if(type.equals("updtae")) {
			
			out.println("enter to update ticket");
			
			try {
				its.updateTicketservice();
				out.println("complete delete ticket");
			}
			catch(Exception e) {
				out.println("exception occur in update"+e);
			}
			
		}
		
		doGet(request, response);
	}

}
