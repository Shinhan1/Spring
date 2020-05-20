package spring_app05_maven;

public class Police implements Character {
	
	Weapon w;
	StunGun sg;
	int hp;
	
	public Police() {
		this.hp = 100;
	}
	
	public Police(Weapon w, int hp) {
		this.w = w;
		this.hp = hp;
	}
	
	
	

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}

	public StunGun getSg() {
		return sg;
	}

	public void setSg(StunGun sg) {
		this.sg = sg;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("뚜벅뚜벅");
	}

	@Override
	public void eat(String it) {
		// TODO Auto-generated method stub
		System.out.println(it + "역시 맛있음");
	}

	@Override
	public void attack(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + " 공격");
		w.use();
	}

	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + " 획득");
	}

}
