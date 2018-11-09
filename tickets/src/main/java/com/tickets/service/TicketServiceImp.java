package com.tickets.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import com.tickets.dao.ITicketDao;
import com.tickets.dao.TicketDaoImp;
import com.tickets.model.Tickets;

public class TicketServiceImp implements ITicketService{
	
	ITicketDao ito=new TicketDaoImp();

	public int addTicketService(HttpServletRequest request) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("ContactServiceImp");
		Tickets cnt=new Tickets();
		cnt.setName(request.getParameter("name"));
		
		cnt.setEmail(request.getParameter("email"));
		cnt.setProblem_type(request.getParameter("problem_type"));
		cnt.setProblem_descr(request.getParameter("problem_descr"));
		cnt.setGroupname(request.getParameter("groupname"));
		cnt.setAssign(request.getParameter("assign"));
		cnt.setStatus(request.getParameter("status"));
		
		System.out.println("now i am entering in daoticketimp class"+cnt);
		
		ITicketDao dao=new TicketDaoImp();
		System.out.println("in service "+cnt);
	 i=dao.addTicket(cnt);
		
		return i;
		
		
	}

	
	public void updateTicketservice() {
		// TODO Auto-generated method stub
		ito.updateTicket();
	}

	
	public void deleteTicketService() {
		// TODO Auto-generated method stub
		ito.deleteTicket();
	}

	
	public List<Tickets> retriveTicketService() {
		// TODO Auto-generated method stub
		//List<Tickets> ll=new ArrayList<Tickets>();
		//ll=ito.retriveTickets(t);
		//System.out.println("complte retrive ticket service");
		return ito.retriveTickets();
	}
	

}
