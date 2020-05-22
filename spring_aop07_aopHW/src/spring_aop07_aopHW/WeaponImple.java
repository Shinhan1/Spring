package spring_aop07_aopHW;

public class WeaponImple implements Weapon {
	String type;
	int bullet;
	
	public WeaponImple() {
		this.bullet = 6;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		if(bullet > 0) {
			bullet--;
			System.out.println("탕!");
		}else {
			System.out.println("총알이 없습니다");
		}
	}
	
	@Override
	public void reload() {
		// TODO Auto-generated method stub
		System.out.println("총알 충전중...");
		
		try {
			for(int i = 0; i < 6; i++) {
				bullet ++;
				System.out.println(bullet);
				Thread.sleep(500);
				if(bullet == 6) break;
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("총알 충전 완료!!");
		
	}
	
}
