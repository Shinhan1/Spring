package spring_app11_JavaConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// xml을 통한 스프링 컨테이너 설정을 자바 객체를 통해 스프링 bean 관리를 할 수 있음
@Configuration
public class JavaConf {
	
//	<bean id="se" class="spring_app11_JavaConf.Sender"></bean>
	@Bean
	public Sender sender() {
//		Sender sender = new Sender();
//		return sender;
//		->
		return new Sender();
	}
	
//	<bean id="sm" class="spring_app11_JavaConf.SystemMoniter">
//		<property name="senedr" ref="se" />
//	</bean>
	@Bean(name = "sm")
	public SystemMonitor systemMonitor() {
		SystemMonitor sm = new SystemMonitor();
		sm.setSender(sender());
		return sm;
	}
	
}
