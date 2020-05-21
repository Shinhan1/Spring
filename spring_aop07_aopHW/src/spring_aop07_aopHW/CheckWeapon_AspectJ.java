package spring_aop07_aopHW;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckWeapon_AspectJ {
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
		
		String methodName = pjp.getSignature().getName();
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = pjp.proceed();
		
		sw.stop();
		
		System.out.println("수행 이름 : " + methodName);
		System.out.println("수행 시간 : " + sw.getTotalTimeSeconds());
		
		return obj;
		
	}
	
	
}
