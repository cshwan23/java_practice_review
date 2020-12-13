package com.zzz.erp;


// Sungjuk 클래스를 객체화 하고 메소드를 호출하기 위한 SungjukExe 클래스 선
public class SungjukExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Sungjuk sjk = new Sungjuk(1, 99, 88, 77);
		// 변수 sjk 선언하기. 
		// 변수 안에 들어갈 데이터 자료형은 Sungjuk 클래스이다.
		// new에 의해 수입된 클래스 중에 Sungjuk(int 매변,int매변,int매변,int매변)
		// 형식의 생성자를 가진 클래스를 찾아 메모리 공간으로 올려버린다.(객체화)
		// 메모리체에 올려진 객체에서 
		// Sungjuk(int ~,~,~)형식의 생성자를
		// Sungjuk(1,99,88,77)로 호출한
		// 즉 외부에서 데이터가 주입된다.
		// Sungjuk 객체의 메위주를 리턴하여 sjk 에 저장하기.
		
		System.out.println("학생번호 : "+sjk.getStu_no());
		System.out.println("국어점수 : "+sjk.getKor());
		System.out.println("영어점수 : "+sjk.getEng());
		System.out.println("수학점수 : "+sjk.getMat());
		System.out.println("총점 : "+sjk.getTot());
		System.out.println("평균 : "+sjk.getAvg());
		System.out.println("학점 : "+sjk.getHakjum());
		System.out.println("----------");
		System.out.println("국어점수 수정발생");
		System.out.println("----------");
		sjk.setKor(84);
		System.out.println("학생번호 : "+sjk.getStu_no());
		System.out.println("국어점수 : "+sjk.getKor());
		System.out.println("영어점수 : "+sjk.getEng());
		System.out.println("수학점수 : "+sjk.getMat());
		System.out.println("총점 : "+sjk.getTot());
		System.out.println("평균 : "+sjk.getAvg());
		System.out.println("학점 : "+sjk.getHakjum());
		System.out.println("----------");
		System.out.println("학생 총 조회수 : "+sjk.cnt);
		System.out.println("----------");
		
		Sungjuk sjk2 = new Sungjuk(2,70,60,80);
		System.out.println("학생번호 : "+sjk2.getStu_no());
		System.out.println("국어점수 : "+sjk2.getKor());
		System.out.println("영어점수 : "+sjk2.getEng());
		System.out.println("수학점수 : "+sjk2.getMat());
		System.out.println("총점 : "+sjk2.getTot());
		System.out.println("평균 : "+sjk2.getAvg());
		System.out.println("학점 : "+sjk2.getHakjum());
		System.out.println("----------");
		System.out.println("학생 총 조회수 : "+sjk.cnt);
		System.out.println("----------");
		
		Sungjuk sjk3 = new Sungjuk(3);
		
		sjk3.setKor(55);
		sjk3.setEng(65);
		sjk3.setMat(75);
		System.out.println("학생번호 : "+sjk3.getStu_no());
		System.out.println("국어점수 : "+sjk3.getKor());
		System.out.println("영어점수 : "+sjk3.getEng());
		System.out.println("수학점수 : "+sjk3.getMat());
		System.out.println("총점 : "+sjk3.getTot());
		System.out.println("평균 : "+sjk3.getAvg());
		System.out.println("학점 : "+sjk3.getHakjum());
		System.out.println("----------");
		System.out.println("학생 총 조회수 : "+sjk.cnt);
		System.out.println("----------");		
		
		Sungjuk sjk4 = new Sungjuk();
		sjk4.setStu_no(4);
		sjk4.setKor(87);
		sjk4.setEng(86);
		sjk4.setMat(96);
		System.out.println("학생번호 : "+sjk4.getStu_no());
		System.out.println("국어점수 : "+sjk4.getKor());
		System.out.println("영어점수 : "+sjk4.getEng());
		System.out.println("수학점수 : "+sjk4.getMat());
		System.out.println("총점 : "+sjk4.getTot());
		System.out.println("평균 : "+sjk4.getAvg());
		System.out.println("학점 : "+sjk4.getHakjum());
		System.out.println("----------");
		System.out.println("학생 총 조회수 : "+sjk.cnt);
		System.out.println("----------");			
	}
	
	// 성적 객체 두명 객체화 했는데 n명의 학생 정보를 n개의 객체를 조회하고싶은데 아는 방법이 있는가?
	// 언제든 학생 조회수를 알고 싶을 경우
	// static 특성
	// 1. 객체 생성 없이도 호출 가능
	// Sungjuk 클래스 안에 public static int cnt;
	// cnt++ 속성변수 안에 객체 끼리 통신. 누적된 값이 나옴.
	// static 이 붙은 속성변수는 어떻게 호출하는가?
	// class명. 속성변수

}



