package com.hef.com;

public class Student 
{
	private String username;
	private int rollno;
	private String address;
	private int contact;
	
	Student()
	{
		
	}
	Student(String username,int rollno,String address,int contact)
	{
		this.username=username;
		this.rollno=rollno;
		this.address=address;
		this.contact=contact;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", rollno=" + rollno + ", address=" + address + ", contact=" + contact
				+ "]";
	}
	

}
