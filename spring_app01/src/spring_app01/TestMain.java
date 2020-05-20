package spring_app01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	// 홍길동 님 안녕하세요 - 출력해보세요
	
	public static void main(String[] args) {
//		HelloKr hk = new HelloKr();
//		hk.sayHello("홍길동");
//		
//		HelloUS hs = new HelloUS();
//		hs.sayHello("JOHN");
		
//		HelloUS h = new HelloUS();
//		h.sayHello("홍길동");
		
		// 위처럼 구동하도록 xml 파일 읽어들이기
		// : 스피링 컨테이너를 이용하여 읽어들이는 방식
		
		/* xml 불러오기 */
		BeanFactory factory =
				new XmlBeanFactory(new FileSystemResource("src/app01.xml"));
		
		Object obj = factory.getBean("h");		// xml에 있는 Bean의 id로 찾아오기
		
		Hello kr = (Hello)obj;
		
		kr.sayHello("홍길동");
		
		Hello fr = (Hello)factory.getBean("h2");
		
		fr.sayHello("Anna");
	
		
		
		
	}

}
