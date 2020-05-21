package spring_aop05_around_advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestAop05 {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("aop05.xml");
		
		CustomerService cs = ctx.getBean("proxyBean", CustomerService.class);
		cs.printName();
		cs.printEmail();
	}
}
