package com.tickets.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import com.mysql.cj.xdevapi.Statement;

import com.tickets.model.Tickets;

public class TicketDaoImp implements ITicketDao {

	
	public int addTicket(Tickets t) {
		// TODO Auto-generated method stub
		int i=0;
		try {
		
		Connection conn=DbConn.getConn();
		
		String qury="insert into tickets (name, email, problem_type, problem_descr, groupname, assign, status) values(?,?,?,?,?,?,?)";
		System.out.println("enter next to insert");
		PreparedStatement ps=conn.prepareStatement(qury);
		
		System.out.println("enter query to insert");
		ps.setString(1, t.getName());
		ps.setString(2, t.getEmail());
		ps.setString(3, t.getProblem_type());
		ps.setString(4, t.getProblem_descr());
		ps.setString(5, t.getGroupname());
		ps.setString(6, t.getAssign());
		ps.setString(7, t.getStatus());
		System.out.println("enter add to insert");
		i=ps.executeUpdate();
		
		if(i != 0)
			System.out.println("ticket added succesfully");
		else
			System.out.println("ticket added failed");
		
		
		
		}
		catch(Exception e) {
			
			System.out.println("exception is "+e);
		
		}
		
		
		
		
		
		return i;
	}
	
	
	public void updateTicket() {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//int j;
		//String str;
		//Scanner sc1=new Scanner(System.in);
		//System.out.println("change email id ");
		//System.out.println("enter new email id and ticketid");
		//str=sc.nextLine();
		//j=sc.nextInt();
		try {
			DbConn db=new DbConn();
			Connection conn=db.getConn();
			
			String qury="update tickets set email=? where tid=?";
			PreparedStatement ps=conn.prepareStatement(qury);
			ps.setString(1, "vamsi123@gmail.com");
			ps.setInt(2, 2);
			ps.executeUpdate();
					
			
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
		}

	}

	
	public void deleteTicket() {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		int i=1;
		try {
			DbConn db=new DbConn();
			Connection conn=db.getConn();
			
			
				//System.out.println("enter a ticket id");
				//i=sc.nextInt();
			String qury="delete from tickets where tid=?";
			PreparedStatement ps=conn.prepareStatement(qury);
			ps.setLong(1, i);
			
			ps.executeUpdate();
				
			
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
		}


	}

	
	public List<Tickets> retriveTickets() {
		// TODO Auto-generated method stub
		List<Tickets> list=new ArrayList<Tickets>();
		
		try {
			DbConn db=new DbConn();
			Connection conn=db.getConn();
			Tickets tt =new Tickets();
			String query="select * from tickets";
			
			PreparedStatement ps=conn.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				int tid=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String problem_type=rs.getString(4);
				String problem_descr=rs.getString(5);
				String groupname=rs.getString(6);
				String assign=rs.getString(7);
				String status=rs.getString(8);
				
				
				
				tt.setTid(tid);
				tt.setName(name);
				tt.setEmail(email);
				tt.setProblem_type(problem_type);
				tt.setProblem_descr(problem_descr);
				tt.setGroupname(groupname);
				tt.setAssign(assign);
				tt.setStatus(status);
				
				System.out.println(tt);
				System.out.println("add ticket suceess");
				list.add(tt);
				System.out.println(list);
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		
		return list;
	}

}
