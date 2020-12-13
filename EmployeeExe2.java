package com.zzz.erp;


class Employee2{
	
	private int emp_no;
	private String emp_name;
	private String phone;
	
	private Career[] careers;
	
	
	

	public int getEmp_no() {
		return emp_no;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public String getPhone() {
		return phone;
	}

	public Career[] getCareers() {
		return careers;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCareers(Career[] careers) {
		this.careers = careers;
	}
	
	
	
	
	
}


class Career{
	
	private String cor_name;
	private String jikup;
	private String enter_date;
	private String retired_date;
	
	
	
	public String getCor_name() {
		return cor_name;
	}
	public String getJikup() {
		return jikup;
	}
	public String getEnter_date() {
		return enter_date;
	}
	public String getRetired_date() {
		return retired_date;
	}
	public void setCor_name(String cor_name) {
		this.cor_name = cor_name;
	}
	public void setJikup(String jikup) {
		this.jikup = jikup;
	}
	public void setEnter_date(String enter_date) {
		this.enter_date = enter_date;
	}
	public void setRetired_date(String retired_date) {
		this.retired_date = retired_date;
	}
	
	
}

public class EmployeeExe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Career[] careers = new Career[3];
		
		careers[0] = new Career();
		
		careers[0].setCor_name("삼성");
		careers[0].setJikup("과장");
		careers[0].setEnter_date("1984-12-25");
		careers[0].setRetired_date("2015-08-25");
		
		careers[1] = new Career();
		
		careers[1].setCor_name("LG");
		careers[1].setJikup("대리");
		careers[1].setEnter_date("2015-12-25");
		careers[1].setRetired_date("2016-08-25");
		
		
		careers[2] = new Career();
		
		careers[2].setCor_name("SK");
		careers[2].setJikup("차장");
		careers[2].setEnter_date("2017-12-25");
		careers[2].setRetired_date("2019-08-25");
		
		Employee2 employee = new Employee2();
		
		employee.setEmp_no(1);
		employee.setEmp_name("최오현");
		employee.setPhone("010-6332-1039");
		
		employee.setCareers(careers);
		
		
		System.out.println("[직원번호] => "+ employee.getEmp_no());
		System.out.println("[직원이름] => "+ employee.getEmp_name());
		System.out.println("[직원전화번호] => "+ employee.getPhone());
		
		Career[] careers22 = employee.getCareers();
		
		for(int i = 0; i< careers22.length; i++) {
			System.out.println("------------");
			System.out.println("경력회사 : "+(i+1));
			System.out.println("------------");
			System.out.println("회사명 : " + careers22[i].getCor_name());
			System.out.println("직급 : " + careers22[i].getJikup());
			System.out.println("입사일 : " + careers22[i].getEnter_date());
			System.out.println("퇴사일 : " + careers22[i].getRetired_date());
		}
		
		
		
	}

}
