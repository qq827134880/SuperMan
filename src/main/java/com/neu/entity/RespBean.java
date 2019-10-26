package com.neu.entity;

public class RespBean {
	private String status = "success";
	private String msg;
	private User user;
	
	public RespBean(String status, String msg, User user) {
		super();
		this.status = status;
		this.msg = msg;
		this.user = user;
	}
	public RespBean(String msg, User user) {
		super();
		this.msg = msg;
		this.user = user;
	}
	public RespBean(String status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public RespBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
