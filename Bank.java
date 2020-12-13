package com.zzz.erp;

public class Bank {

	
	private int tot_money = 9000;
	
	
	public int getMoney() {
		return tot_money;
	}
	
	// deposit 입금 메소드 
	public void deposit(int deposit_money) {
		tot_money = tot_money + deposit_money;
		
		System.out.println("입금성공 - 입금액 = " + deposit_money + " 현재 잔액 = " + tot_money);
		
	}
	// withdraw 출금 메소드 
	// 외부에서 출금 금액이 들어오는 경우 (매개변수로) 
	public void withdraw(int withdraw_money) {
		if(tot_money >= withdraw_money) {
			tot_money = tot_money - withdraw_money;
			
			System.out.println("출금성공! : 출금액 = " + withdraw_money);
		}else {
			System.out.println("출금실패! : 출금액 = "+ withdraw_money +"는 현재잔액 "+tot_money+"보다 큽니다.");
		}
		
	}
	
	
	
}
