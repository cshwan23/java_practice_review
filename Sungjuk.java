package com.zzz.erp;

// 학생 성적을 관리하는 클래스 선언
// 클래스 이름은 의미있게 주어야하고, 관용적으로 대문자로 시작.
public class Sungjuk {

	//<속성변수 선언>
	// 학생의 번호 속성변수 선언
	// 학생의 번호는 객체화 시킬 때 집어 넣을 거다.
	// 학생의 <성적>을 관리하는 클래스이다.
	// 학생 정보를 관리하는 클래스는 따로 있을거다.
	private int stu_no;
	
	// 왜 점수에 데이터를 안 넣은 걸까?
	// 어떤 학생의 데이터를 저장할 지 모른다.
	// 학생의 정보는 객체화 된 후 집어넣거나 과정 중에 집어넣을거다.
	// 우리의 최종 목적은 객체이다.
	
	private int kor;
	
	private int eng;
	
	private int mat;
	
	// 속성변수 앞에 static 이 붙으면 n개의 객체에 공유한다.
	// 이렇게 하면 기본적으로 0이 들어간다.
	// cnt 앞에 static 을 빼면 독단적이게 되서 누적되지 않는다.
	public static int cnt;
	
	
	// 클래스를 구성하는 3대 멤버 중 생성자를 만들거다.
	// 생성자 하나도 선언 안해도 된다.
	// 하나는 알아서 만들어준다. 
	// 생성자 호출시 외부에서 데이터가 들어올 경우 매개변수를 받아온다.
	
	public Sungjuk(int stu_no, int kor, int eng, int mat) {
		
		this.stu_no = stu_no;
		
		this.kor = kor;
		
		this.eng = eng;
		
		this.mat = mat;
		
		cnt++;
	}
	
	// 생성자 하나 더 만들겠다.
	// 똑같은 이름을 두개 생성자를 만드는것을 overloading이라 한다.
	// 생성자 오버로딩 성공 규칙
	// 1. 매개변수의 개수가 달라야한다.
	// 2. 매개변수의 개수가 똑같으면 매개변수의 자료형이 달라야 한다.
	public Sungjuk(int stu_no) {
		
		this.stu_no = stu_no;
		cnt++;
	}
	
	public Sungjuk() {
		cnt++;
	}
	
	// 메소드 선언
	public int getStu_no() {
		return stu_no;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public int getTot() {
		return kor+eng+mat;
	}
	public double getAvg() {
		return getTot()/3;
	}
	
	public String getHakjum() {
		double avg = getAvg();
		String hakjum = "F";
		
		if(avg>=90 && avg<=100) {
			hakjum = "A";
		}else if(avg>=80) {
			hakjum = "B";
		}else if(avg>=70) {
			hakjum = "C";
		}else if(avg>=60) {
			hakjum = "D";
		}
		
		return hakjum;
	}
	// 점수를 수정하는 메소드 setter 메소드 
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setStu_no(int stu_no) {
		this.stu_no = stu_no;
	}
	// 실행되지 않는다. 아직 객체화 하지 않았기 때문에.
	// 이 클래스를 객체화 시켜줄 클래스를 하나 더 만들어야 한다.
	

}
/*
----------------------------------------------------------
<문1> public class Sungjuk{~} 을 class Sungjuk {~}로 고치면?
----------------------------------------------------------
에러 발생. com.bbb.erp.SungjuExe 클래스에서 import (com.aaa.erp.Sungjuk)에서 에러발
에러 이유. 수입 대상 클래스 마빡에 public 이 없으면 타 패키지에서 수입이 불가하다. 

----------------------------------------------------------
<문2> 위 Sungjuk 클래스를 객체화 하기 전에
	 private int kor; 로 선언된 속성변수 kor 에는 뭐가 들어있나?
----------------------------------------------------------
정답 : 0 
속성변수는 직접 데이터를 저장하지 않으면 default 값이 저장된다(=자동 초기화)
디폴트 값이 자동으로 들어가 있는 것을 유식한 말로 자동 초기화라고 한다.
왜? 메소드 안에 선언되는 지역변수와 달리 속성변수는 클래스를 구성하는 중요한 요소이므로
자동 초기화가 된다.

----------------------------------------------------------
<문3> private int kor; 을 private double kor; 로 수정하면?
----------------------------------------------------------
정답 : 에러 발생.
에러위치 : public int getKor(){return kor;} 부분에서 에러 발생
return kor 에서 실수가 리턴되는데 리턴자료형이 Int기 때문에 소수점자리가 날라가버려서 에러.
public int get Tot(){return kor+mat+eng;}부분에서 에러 발생
같은 이유.
 
 ----------------------------------------------------------
<문4> public int getKor(){return kor;}을 
	public double getKor(){return kor;}로 수정하면? 
----------------------------------------------------------
 double 로 바꾸더라도. get메소드는 반환하는 메소드기 때문에.
 속성변수가 int여도 반환값이 double 이면 더블이 정수를 포함하기때문에 가능하다.
 에러 없음.
 
 ----------------------------------------------------------
<문5> public int getKor(){return kor;}을 
	int getKor(){return kor;}로 수정하면? 
---------------------------------------------------------- 
 동일 패키지에선 가능 하다. 접근 지정자가 default 이기 때문에 
 타 패키지에서 호출 시 에러. 
 
 ------------------------------------------------------	
 <문6> private int kor; 를 private final int kor; 로 수정하면?
 ------------------------------------------------------
 
 */














