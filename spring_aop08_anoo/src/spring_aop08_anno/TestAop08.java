package spring_aop08_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestAop08 {
	public static void main(String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("aop08.xml");
		
		CustomerService cs = ctx.getBean("cs", CustomerService.class);
		cs.printName();
		cs.printEmail();
	}

}
