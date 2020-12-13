package com.zzz.erp;

interface Speed{
	
	public int startSpeed = 10;
	
	public void speedUp();
	public void speedDown();
	
	
}

class Car implements Speed{
	
	int nowSpeed = startSpeed;
	
	public void speedUp() {
		nowSpeed++;
	}
	public void speedDown() {
		nowSpeed--;
	}
	public int getSpeed() {
		return nowSpeed;
	}
}


public class carExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		car.speedUp();
		
		System.out.println(car.getSpeed());
		
		car.speedDown();
		car.speedDown();
		
		System.out.println(car.getSpeed());
		
		System.out.println(Speed.startSpeed);
		
		
	}

}
/*
 
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문1>	int nowSpeed = startSpeed;를
		int nowSpeed = ++startSpeed;로 수정하면?
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
=> 에러발생. 컴파일발생.
=> 인터페이스 내부의 속성변수는 final 의 성격을
   가지고 있어 데이터 갱신이 불가능하기 때문
=> car 클래스에서 에러가 발생하여 컴파일 실패한다. 


interface 안의 속셩변수는 절대 못바꿔
interface 성격은 규칙이다.
절대적인 규칙을 선언한 대상이다.
본사 규칙이다.
인터페이스 자체가 규칙을 나열되어이 있는 놈이다. 


//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문2>	public int startSpeed = 10;를
		private int startSpeed = 10;로 수정하면?
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


 => 에러발생. 컴파일 실패
 => 인터페이스의 메소드, 속성변수는 무조건 public의 성격이다.
   그러므로 인터페이스 쪽에서 에러가 발생한다. 
   
   
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문3>	public void speedUp() {nowSpeed++;} 을
		void speedUp() {nowSpeed++;} 로 수정하면?
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

=> 에러발생, 컴파일 실패
=> 인터페이스의 메소드는 public이 붙든 안붙든
   무조건 public 성격을 가지고 있으므로 오버라이딩 규칙을 지켜야함.
   오버라이딩 시 접근지정자는 슈퍼클래스(인터페이스)보다 크거나 같아야한다. 
 
<오버라이딩 규칙>
부모 메서드를 자식클래스에서 그대로 가져다 사용.
사용규칙  1. 메소드명 같아야.
        2. 접근지정자 같거나 커야한다.
 		3. 리턴형 같타야한다
 		4. 매개변수 갯수 같아야 한다.
 		5. 매개변수 자료형 같아야 한다. 
 		
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문4>	만약 public void speedUp(){nowSpeed++}를 생략하면? *******
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
=> 에러 발생
=> 인터페이스가 소유한 메소드를 모두 재정의(overriding) 하지 않으면
   이 클래스도 추상클래스가 되므로 car class 앞에 abstract 가 붙어야 한다. 
   
   car class 앞에 abstract 를 붙이면 추상클래스가 되니 에러가 나지는 않지만 
   밑에 실행 클래스에서 에러가 또 터진다,.
   객체화가 안되었는데 객체화 시도를 하고있다.
   Car car = new Car(); 에서 에러가 난다.
   추상클래스는 객체화가 불가능한데 객체화 시도하는 new 에서 에러가 발생한다 
   
 */



