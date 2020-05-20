package spring_app07_maven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestApp07 {
	public static void main(String[] args) {
		// app.xml을 통해서 출력해보세요
		// 현재 시각 : ~~시 ~~분
		// msg : 스프링 재밌다
		
//		BeanFactory factory = 
//				new XmlBeanFactory(new FileSystemResource("src/app07.xml"));
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("app07.xml");
		
//		GreetingImple gr = factory.getBean("gr", GreetingImple.class);
		Greeting gr = context.getBean("gr", Greeting.class);
		
		gr.printMsg();
		
//		의존 자동 설정
//		@Autowired : 스프링 전용 - 연결 : 타입에 맞춰서 연결
//		@Injection : 자바에서 지원 - 연결 : 타입에 맞춰서 연결
//		@Resource  : 자바에서 지원 - 연결 : 이름으로 연결
		
		
	}
}
