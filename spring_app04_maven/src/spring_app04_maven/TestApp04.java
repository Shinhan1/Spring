package spring_app04_maven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestApp04 {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app04_maven.xml"));
		
		Message m = factory.getBean("g", Message.class);
		
		m.sayHello("호환성 체크가 앞으로 짱나실거에요 ... ");
	}
}
