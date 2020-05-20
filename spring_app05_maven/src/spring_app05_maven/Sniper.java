package spring_app05_maven;

public class Sniper implements Character {
	Weapon w;
	Gun g;
	int hp;
	
	public Sniper() {
		// TODO Auto-generated constructor stub
		this.hp = 100;
	}
	
	public Sniper(Weapon w, int hp) {
		// TODO Auto-generated constructor stub
		this.w = w;
		this.hp = hp;
	}
	
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void attack(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + "을 조준하고 호흡을 멈춘 후에 쏜다");
		w.use();
	}
	
	@Override
	public void eat(String it) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		
	}
	
}
