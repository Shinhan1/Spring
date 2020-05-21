package spring_aop04_after_throw_advice;

public class MessageImple implements Message {
	
	String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	@Override
	public void prtMsg() {
		// TODO Auto-generated method stub
		System.out.println("출력 메세지 : " + msg);
	}
	
	@Override
	public void printThrowMessage() {
		throw new IllegalArgumentException();
		
	}
}
