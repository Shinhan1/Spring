package spring_app10_annoEx;

import org.springframework.beans.factory.annotation.Autowired;

public class SmartPhone implements Phone {
	
	@Autowired
	PhoneOS os;
	
	

	

	public void setOs(PhoneOS os) {
		this.os = os;
	}

	@Override
	public void call(String callNumber) {
		System.out.println(callNumber + ".... 전화 거는 중");
		
	}

	@Override
	public void sendMsg(String msg) {
		System.out.println(msg + "전송 중");
		
	}
	
	public void playGame(String title) {
		System.out.println(title + "게임하기");
	}
	
	public void watchingNetflix(String title) {
		System.out.println(title + "감상하기");
	}
	
	public void showInfo() {
		os.printOS();
		os.prtVersion();
	}

}



















