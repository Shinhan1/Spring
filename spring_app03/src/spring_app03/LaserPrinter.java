package spring_app03;

public class LaserPrinter implements printer {
	
	String laser;
	
	public LaserPrinter() {
		laser = "지이이잉 ~~~~~~";
	}
	
	public LaserPrinter(String laser) {
		this.laser = laser;
	}
	
	
	@Override
	public void print(String msg) {
		System.out.println(msg + " : " + laser);
		
	}
}
