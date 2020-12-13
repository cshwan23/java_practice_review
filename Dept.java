package com.zzz.erp;

public class Dept {

	//부서번호 
	private int dept_no;
	//부서명 
	private String dept_name;
	//부서위치 
	private String dept_loc;
	
	
	
	//[getter]메소드 
	public int getDept_no() {
		return dept_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	public String getDept_loc() {
		return dept_loc;
	}
	
	
	//[setter]메소드 
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public void setDept_loc(String dept_loc) {
		this.dept_loc = dept_loc;
	}
	/*
	DTO
	Data Transfer Object 
	속성변수 xxx 메소드 getXxx(){} 메소드setXxx(){} 가 한쌍으로 n개 존재하는 클래스를
	객체화 했을 때 이걸 DTO 라고 부른다.
	다량의 데이터를 저장하여 옮겨다닐 때 특히 DB 연동 시 많이 사용한다,.
	DTO를 VO (value object)라고 부르기도 한다 주로 값을 갖고있다해서 
	EmployeeDTO 클래스는 직원들의 다량의 정보를 말한다.
	DTO 클래스 안의 속성변수명이 DB의 테이블 컬럼명과 일치하는 경우가 많다.
	특히 스프링(Spring)에서 DTO 클래스의 역할은 어마무시하다,. 작업이 굉장히 편리해짐. 
	
	DAO
	Data Access Object 
	직접 DB 연동을 하는 클래스의 객체를 지칭한다.
	주로 DB 에 입력, 수정, 삭제, 검색 하는 기능을 가진다. 
*/
	
	
	
	
}
