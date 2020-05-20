package spring_app05_maven;

public class Gun implements Weapon {
	int bullet = 0;
	
	public Gun() {
		// TODO Auto-generated constructor stub
		this.bullet = 1;
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		if(bullet > 0) {
			System.out.println("탕~~~!!");
			bullet --;
		}else {
			System.out.println("총알이 없어요! 충전 하세요");
		}
	}
	
	@Override
	public void reuse() {
		System.out.println("재충전");
		bullet = 6;
		
	}
	
	@Override
	public void drop() {
		System.out.println("충전기 보급 좀 ...");
		bullet = 0;
		
	}

}
