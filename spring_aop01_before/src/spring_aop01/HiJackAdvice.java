package spring_aop01;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// 이 객체를 메인 업무 호출 전에 실행 하고 싶음
public class HiJackAdvice implements MethodBeforeAdvice {
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("공통된 관심업무를 지칭");
		System.out.println("메인업무가 실행되기 전에 가로채기");
	}
}
