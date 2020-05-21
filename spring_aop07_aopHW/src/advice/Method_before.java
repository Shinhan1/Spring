package advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Method_before implements MethodBeforeAdvice {
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------");
		System.out.println("메소드 시작 전");
	}
}
