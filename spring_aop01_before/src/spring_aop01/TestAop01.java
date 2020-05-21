package spring_aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestAop01 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app01.xml");
		CustomerService cs = context.getBean("execute", CustomerService.class);
		
		cs.printName();		// 메인업무가 실행되기전 HiJackAdvice가 실행된다.
		cs.printEmail();
		
	}
}
