package com.tickets.model;

public class Tickets {
	private int tid;
	private String name;
	private String email;
	private String problem_type;
	private String problem_descr;
	private String groupname;
	private String assign;
	private String status;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Tickets [tid=" + tid + ", name=" + name + ", email=" + email + ", problem_type=" + problem_type
				+ ", problem_descr=" + problem_descr + ", groupname=" + groupname + ", assign=" + assign + ", status="
				+ status + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProblem_type() {
		return problem_type;
	}
	public void setProblem_type(String problem_type) {
		this.problem_type = problem_type;
	}
	public String getProblem_descr() {
		return problem_descr;
	}
	public void setProblem_descr(String problem_descr) {
		this.problem_descr = problem_descr;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public String getAssign() {
		return assign;
	}
	public void setAssign(String assign) {
		this.assign = assign;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}







}
