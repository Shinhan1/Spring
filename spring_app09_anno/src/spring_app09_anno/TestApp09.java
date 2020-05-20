package spring_app09_anno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class TestApp09 {
	public static void main(String[] args) {

		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("app09.xml");
		
		Character ch1 = context.getBean("p1", Character.class);
		ch1.attack("도둑님");
		
		
		
		
	}
}
