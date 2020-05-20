package spring_app03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test_app03 {
	
	public static void main(String[] args) {
		
		BeanFactory factory = 
				new XmlBeanFactory(new FileSystemResource("src/app03.xml"));
		
//		Object obj1 = factory.getBean("dot");
//		Object obj2 = factory.getBean("laser");
//		
//		printer pr1 = (printer) obj1;
//		printer pr2 = (printer) obj2;
//		
//		pr1.print("dot");
//		pr2.print("laser");
		
		printer pr1 = factory.getBean("dot", printer.class);
		printer pr2 = (printer) factory.getBean("laser");
		
		pr1.print("wow 놀라운 프로그래밍 세계 ...");
		
	}

}
