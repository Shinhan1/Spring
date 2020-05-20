package spring_app10_annoEx;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestApp10 {
	public static void main(String[] args) {
//		Phone phone = new SmartPhone();
//		phone.call("010-1111-2222");
//		phone.sendMsg("안녕");
		
		
//		BeanFactory factory =
//				new XmlBeanFactory(new ClassPathResource("app.xml"));
//		
//		PhoneOS phone = factory.getBean("os", PhoneOS.class);
//		System.out.println(phone.name);
		
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("app10.xml");
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConf.class);
		
		SmartPhone phone = context.getBean("p", SmartPhone.class);
		phone.call("01022223333");
		phone.showInfo();
		
		
		
	}

}
