package com.zzz.erp;


class Account{
	
	String accountNo;
	int remainAmount = 9000;
	
	public Account() {}
	
	public Account(String accountNo, int remainAmount) {
		
		this.accountNo = accountNo;
		this.remainAmount = remainAmount;
		
	}
	
	public void deposit(int inputAmount) {
		
		remainAmount = remainAmount + inputAmount;
		System.out.println("\n[입금발생] => [입금액]: "+inputAmount +
				"[잔고]: " +remainAmount +"\n");
	}
	
	public void withdraw(int outputAmount) {
		
		if(outputAmount<=remainAmount) {
			
			remainAmount = remainAmount - outputAmount;
			
			System.out.println("\n[출금발생] => [출금액] : "+outputAmount +
					"[잔고] : "+remainAmount);
			
		}else {
			System.out.println("\n[잔액] : "+remainAmount+"[출금시도액] : "+outputAmount +
					"[출금실패] : 출금액이 잔액보다 큽니다.");
		}
	}
	
}

class CheckCard extends Account {
	
	public String cardNo;
	private int totPaymentAmount;
	
	public CheckCard() {}
	public CheckCard(String accountNo, int remainAmount, String cardNo) {
		
	super(accountNo, remainAmount);
	this.cardNo = cardNo;
	
	}
	
	public void cardPayment(int paymentAmount) {
		if(remainAmount >= paymentAmount) {
			totPaymentAmount = totPaymentAmount + paymentAmount;
			remainAmount = remainAmount - paymentAmount;
			System.out.println("카드지출발생 - 카드 지출액 : "+paymentAmount +"잔고 : "
					+remainAmount+" 카드 총 지출액 " + totPaymentAmount);
		}else {
			System.out.print("체크카드지출발생 - 체크카드 지출실패 지출 금액이 잔고보다 많습니다. ");
		}
	}
}


public class CheckCardExe {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();
		
		// +5000
		CheckCard card = new CheckCard("112233", 5000, "123456");

		
		card.cardPayment(6000);
		
		card.cardPayment(2000);
	}

}








