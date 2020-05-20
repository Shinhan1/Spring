package spring_app02;

public class BevImple implements Beverage{

	String product;
	
	public BevImple() {
		this.product = "냉수";
	}
	
	public BevImple(String product) {
		this.product = product;
	}
	
	
	@Override
	public void drink(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "님이" + product + "을 홀짝홀짝 마셔요");
		
	}

}
