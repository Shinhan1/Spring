package spring_app05_maven;

public class StunGun implements Weapon {
	
	int bullet;
	
	public StunGun() {
		this.bullet = 1;
	}
	
	@Override
	public void use() {
		System.out.println("지이이잉 ~~~");
//		bullet--;
		bullet = 0;
	}
	
	@Override
	public void reuse() {
		System.out.println("재충전");
		bullet = 1;
		
	}
	
	@Override
	public void drop() {
		System.out.println("충전기 보급 좀 ...");
		bullet = 0;
		
	}
	
}
