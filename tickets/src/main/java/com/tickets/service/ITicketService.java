package com.tickets.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.tickets.model.Tickets;

public interface ITicketService {
	public int addTicketService(HttpServletRequest request);
	public void updateTicketservice();
	public void deleteTicketService();
	public List<Tickets> retriveTicketService();


	

}
