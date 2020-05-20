package spring_app05_maven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestApp05 {
	public static void main(String[] args) {
//		StunGun sg = new StunGun();
//		
//		Police pl = new Police(sg, 150);
//		
//		pl.attack("도둑님");
//		System.out.println(pl.hp);
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app05.xml"));
		
		Police ch1 = factory.getBean("p", Police.class);
		ch1.attack("도둑님");
		System.out.println(ch1.hp);
		
		System.out.println("----------------------------------------------------------");
		
		// 경찰 스나이퍼가 인질범을 총으로 공격하도록 해보세요
		// 출력 : 인질범을 숨을 멈추고 탕 쏜다
		//    : 스나이퍼 hp = 98
		
		Sniper sniper = factory.getBean("sniper", Sniper.class);
		sniper.attack("인질범");
		System.out.println("스나이퍼  hp = " + sniper.hp);
		
	}
}
