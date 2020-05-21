package spring_aop05_around_advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class CheckTime implements MethodInterceptor {
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// 메인 업무 메소드 수행시간을 구하기
		// 현재 시각 - 수행시간을 체크하고자 하는 메소드 실행 - 현재 시각
		
//		// 1. 현재 시각을 구한다
//		long before = System.currentTimeMillis();
//		
//		// 2. 수행 시간을 체크하고자 하는 메소드 실행
//		invocation.proceed();
//		
//		// 3. 현재 시각을 구한다
//		long after = System.currentTimeMillis();
//		
//		// 4. 메소드 수행 시간을 구하기
//		long result = after - before;
		
		// 위 작업이 의외로 많이 사용되므로 객체로 만들어져있음
		StopWatch sw = new StopWatch();
		
		// 1. 현재 시각 구하기
		sw.start();
		
		// 2. 수행시간을 체크하기 위한 메소드 수행
		Object obj = invocation.proceed();
		
		// 3. 현재 시각 구하기
		sw.stop();
		
		// 4. 처리 시간 출력
		System.out.println("처리 시간 : " + sw.getTotalTimeSeconds());
		
		return obj;
	}
	
}
