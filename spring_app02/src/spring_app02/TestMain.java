package spring_app02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
		// 반장님이 커피를 홀짝홀짝 마셔요 => 출력
//		Beverage h = new BevImple();
//		h.drink("반장");
		
		//2) 반장님이 다른 음료를 마실 수 있도록 수행
		BeanFactory factory =
				new XmlBeanFactory(new FileSystemResource("src/app02.xml"));
		
		Object obj1 = factory.getBean("b"); 
		Object obj2 = factory.getBean("t");
		
		// 스프링 프레임워크는 Bean관리를 기본적으로 singleTone으로 한다.
		if(obj1 == obj2) {
			System.out.println("singletone type");
		}
		
		
		// DI(Dependency Injection) : 의존성 주입
		//  : 의존관계에 있어서 XML에 있는 정보를 스프링프레임워크가 run time시
		//    호출해서 동작하는 형태
		
		Beverage b = (Beverage)obj1;
		b.drink("반장");
		
		
	}

}
