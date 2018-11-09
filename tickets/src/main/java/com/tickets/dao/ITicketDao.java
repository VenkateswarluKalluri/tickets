package com.tickets.dao;

import java.util.List;

import com.tickets.model.Tickets;

public interface ITicketDao {
	public int addTicket(Tickets t);
	public void updateTicket();
	public void deleteTicket();
	//public List retriveTickets(Tickets t);
	public List<Tickets> retriveTickets();

}
