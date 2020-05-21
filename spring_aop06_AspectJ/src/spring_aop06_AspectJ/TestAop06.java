package spring_aop06_AspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestAop06 {
	public static void main(String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("aop06.xml");
		
		CustomerService cs = ctx.getBean("cs", CustomerService.class);
		
		cs.printName();
		cs.printEmail();
		
	}
}
