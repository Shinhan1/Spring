package spring_aop07_aopHW;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestAop07 {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("aop07.xml");
		
		Weapon w = ctx.getBean("proxy", Weapon.class);
//		Weapon w = ctx.getBean("weapon", Weapon.class);
		
		w.fire();
		w.reload();
	}
}
