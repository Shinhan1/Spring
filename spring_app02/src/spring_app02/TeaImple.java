package spring_app02;

public class TeaImple implements Beverage {

	String product;
	
	public TeaImple() {
		this.product = "Green Tea";
	}
	
	public TeaImple(String product) {
		this.product = product;
	}
	
	
	
	@Override
	public void drink(String name) {
		System.out.println(name + "님이" + product + "을 홀짝홀짝 마셔요");

	}

}
