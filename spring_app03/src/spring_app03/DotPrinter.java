package spring_app03;

public class DotPrinter implements printer {
	
	String dot;
	
	public DotPrinter() {
		dot = "따다다다닥 ~~~~~";
	}
	
	public DotPrinter(String dot) {
		this.dot = dot;
	}
	
	@Override
	public void print(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg + " : " + dot);
		
		
	}
	
}
