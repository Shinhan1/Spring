package spring_aop10_JavaConf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop10 {
	public static void main(String[] args) {
		 ApplicationContext ctx = 
				 new AnnotationConfigApplicationContext(JavaConf.class);
		 
		 CustomerService cs = ctx.getBean("cs", CustomerService.class);
		 cs.printName();
		 cs.printEmail();
		 
	}
}
