package com.zzz.erp;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] kors = new int[5];
		
		System.out.println(kors[0]);
		
		kors[0] = 94;
		kors[1] = 82;
		kors[2] = 72;
		kors[3] = 62;
		kors[4] = 52;
		
		int tot = 0;
		
		tot = tot + kors[0];
		tot = tot + kors[1];
		tot = tot + kors[2];
		tot = tot + kors[3];
		tot = tot + kors[4];
		System.out.println("[국어총점]=> " +tot);
		
		tot = 0;
		
		for(int i = 0; i<5; i++) {
			tot = tot + kors[i];
		}
		System.out.println("[국어총점]=> " +tot);
		
		
		String[] skill = new String[3];
		
		System.out.println(skill[0]);
		
		skill[0] = "JSP";
		skill[1] = "ASP";
		skill[2] = "PHP";
		
		tot = 0;
		
		for (var i = 0; i<skill.length; i++) {
			System.out.println(skill[i] +" ");
		}
		
		int[][] engs = new int [2][3];
		
		engs[0][0] = 99;
		engs[0][1] = 98;
		engs[0][2] = 97;
		engs[1][0] = 96;
		engs[1][1] = 95;
		engs[1][2] = 94;
		
		tot = 0;
		int stuCnt = 0;
		
		for (var i = 0; i<engs.length; i++) {
			
			for(var j=0; j<engs[i].length; j++) {
				
				tot = tot + engs[i][j];
				stuCnt++;
			}
		}
		System.out.println("영어총점 => "+tot);
		System.out.println("학생수 => "+stuCnt);
		System.out.println("영어평균 => "+(double)tot/stuCnt);
		

		
	}

}

/*
 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문1> 만약 kors[4] = 99; 다음 줄에 kors[5] = 55; 를 삽입하면?
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 에러 발생하지 않지만 실행시 에러가 발생한다.
 존재하지않는 인덱스 번호를 넣으면 에러는 없다. 실행시 나타난다.
 
 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문2> kors[0] = 94; 이전에 System.out.println(kors[0]);을 삽입하면?
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 0이 찍힌다. 
 배열변수는 자동 초기화 되므로 0 이 저장 된다.
 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문3> kors[0] = 94; 에 94.2 로 수정하면? 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

=> 에러발생. 현재 배열변수의 자료형은 int 이므로 실수가 저장될 수 없다. 
 
 
 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문4> 현재 skill 이란 변수에 저장된 데이터의 종류는? 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 1차원 배열 객체가 들어가있다.
 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문5> skills[0] = "JSP"; 이전에 System.out.print(skills[0]);를 출력하면?
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 null 값이 들어가있다.

배열변수는 자동 초기화 된다.
현재 배열 변수의 자료형은 참조형이므로 null로 자동 초기화 된다. 
기본형이 아니면 디폴트 값으로 nill 이 들어간다.

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문6> 

int[] kor = new int[5];
kors[0] = 94;
~
kors[4] = 99;

위 코딩은 어떤 다른 형식 대체할 수 있는가?
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<1>
int[] kors = new int[] {99,99,99,99};
<2>
int[] kors = {99,99,99,99};

이 형식은 안된다. 
int[] kors;
kors = {99,99,99,99}

 
 
 
 
 */








