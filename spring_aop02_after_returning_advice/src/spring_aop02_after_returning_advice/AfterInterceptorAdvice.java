package spring_aop02_after_returning_advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterInterceptorAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("----------------------------------------");
		System.out.println("메인업무 메소드가 호출 된 후에 ");
		System.out.println("실행되는 메소드");
		System.out.println("----------------------------------------");
		
	}


	
}
