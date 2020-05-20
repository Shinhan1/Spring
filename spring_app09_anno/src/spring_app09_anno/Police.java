package spring_app09_anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Police implements Character {
	
	@Autowired                 // DI로 선택할 객체가 2개 이상이면 자동으로 의존 주입이 안됨
	@Qualifier("g")			   // 각각 Autorwired로 묶던지, xml에서 삭제하던지, @Qualifier로 지정
	Weapon w;
	
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


	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat(String it) {
		System.out.println(it + "역시 맛있음");

	}

	@Override
	public void attack(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + "공격");
		w.use();
	}

	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + "득템");

	}

}
