package com.collection.api.map;

public class Department {
	private int did;
	private String deptName;
	private String location;
	public Department(int did, String deptName, String location) {
		super();
		this.did = did;
		this.deptName = deptName;
		this.location = location;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
	
	
	

}
