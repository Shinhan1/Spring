package spring_app11_JavaConf;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestApp11 {
	public static void main(String[] args) {
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("app08.xml");
		
		// 자바 설정으로 읽어들이기
		BeanFactory factory =
				new AnnotationConfigApplicationContext(JavaConf.class);
		
		Monitor mt = factory.getBean("sm", Monitor.class);
		mt.showMonitor();
		
		
	}

}
