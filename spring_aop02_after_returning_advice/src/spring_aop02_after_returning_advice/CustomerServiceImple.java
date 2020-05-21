package spring_aop02_after_returning_advice;

public class CustomerServiceImple implements CustomerService{
	
	String name;
	String email;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("이름 : "+ name);
		
	}
	@Override
	public void printEmail() {
		// TODO Auto-generated method stub
		System.out.println("이메일 :"+ email);
		
	}
	
	
}
