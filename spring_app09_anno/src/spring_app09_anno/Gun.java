package spring_app09_anno;

public class Gun implements Weapon{

	int bullet = 0;
	
	public Gun() {
		this.bullet = 6;
	}
	
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		if(bullet > 0) {
			
			System.out.println("탕~~!");
			bullet --;
			
		}
		
	}

	@Override
	public void reuse() {
		// TODO Auto-generated method stub
		System.out.println("재장전 중");
		bullet = 0;
		
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		System.out.println("아놔");
		
	}

}
