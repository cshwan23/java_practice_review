package com.zzz.erp;

// 직원 정보를 관리하는 Employee 클래스 선언 

public class Employee {

	private int emp_no;
	private String emp_name;
	private String emp_jikup;
	private String phone;
	private String jumin_num;
	private int salary;
	
	private Family family;

	
//----------------------------------------------
	
	public int getEmp_no() {
		return emp_no;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public String getEmp_jikup() {
		return emp_jikup;
	}

	public String getPhone() {
		return phone;
	}

	public String getJumin_num() {
		return jumin_num;
	}

	public int getSalary() {
		return salary;
	}
//----------------------------------------------

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public void setEmp_jikup(String emp_jikup) {
		this.emp_jikup = emp_jikup;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setJumin_num(String jumin_num) {
		this.jumin_num = jumin_num;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//----------------------------------------------
	public Family getFamily() {
		return family;
	}
	
	public void setFamily(Family family) {
		this.family = family;
	}
//----------------------------------------------	
	
	
	
	
	
	
	
	
}



