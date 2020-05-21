package spring_aop03_before_hw;

public class BankServiceImple implements Bank{

	String Name;
	int balance;
	
	
	
	
	public void setBalance(int balance) {
		this.balance = balance;
	}





	public void setName(String name) {
		Name = name;
	}





	@Override
	public void transfer(int money) {
		System.out.println("계좌이체를 시작합니다");
		System.out.println(Name+"님계좌에서 "+money+"원 출금되었습니다.");
		if(balance>money) {
			balance -=money;
		}
		System.out.println("잔액: "+ balance+ "원");
	}
	
	
	
	
	
}
