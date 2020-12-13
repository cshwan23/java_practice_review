package com.zzz.erp;

public class EmployeeExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Family family = new Family();
		
		
		family.setRelation("부");
		family.setF_name("최오현");
		family.setBirth_year(1961);
		
		
		Employee employee = new Employee();
		
		
		employee.setEmp_no(1);
		employee.setEmp_name("최승환");
		employee.setEmp_jikup("대리");
		employee.setPhone("010-4168-0613");
		employee.setJumin_num("900203-1111111");
		employee.setSalary(4000);
		
		employee.setFamily(family);
		
		int emp_no = employee.getEmp_no();
		String emp_name = employee.getEmp_name();
		String jikup = employee.getEmp_jikup();
		String phone = employee.getPhone();
		String jumin_num = employee.getJumin_num();
		int salary = employee.getSalary();
		
		Family family2 = employee.getFamily();
		
		String relation = family.getRelation();
		String F_name = family.getF_name();
		int birth_year = family.getBirth_year();
		
		System.out.println("---------------");
		System.out.println("직원정보");
		System.out.println("---------------");
		System.out.println("직원번호 "+ emp_no);
		System.out.println("직원직급 "+ jikup);
		System.out.println("직원전화번호 "+ phone);
		System.out.println("직원주민번호 "+ jumin_num);
		System.out.println("직원연봉 "+ salary);
		System.out.println("---------------");
		System.out.println("직원가족정보");
		System.out.println("---------------");
		System.out.println("직원가족 관계 "+ relation);
		System.out.println("직원가족 성함 "+ F_name);
		System.out.println("직원가족 생일 "+ birth_year);
		
		
		
	}

}
