package spring_aop07_aopHW;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckWeapon_AspectJ {
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
//		
//		String methodName = pjp.getSignature().getName();
//		
//		StopWatch sw = new StopWatch();
//		
//		sw.start();
//		
//		Object obj = pjp.proceed();
//		
//		sw.stop();
//		
//		System.out.println("수행 이름 : " + methodName);
//		System.out.println("수행 시간 : " + sw.getTotalTimeSeconds());
		Date d = new Date();
		SimpleDateFormat adf = new SimpleDateFormat("YYYY/MM/dd - hh24:mm:ss");
		String useTime = adf.format(d);
		
		String pathName = "C:\\Users\\goott7-9\\Downloads\\log\\weapon1.txt";
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = pjp.proceed();
		
		sw.stop();
		
		double actingTime = sw.getTotalTimeSeconds();
		
		File f = new File(pathName);
		
		if(!f.exists()) {
			f.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(f);
		pw.println(useTime + " : 무기사용 시각");
		pw.println(actingTime + " : 무기 수행시간");
		pw.flush();
		pw.close();
		return obj;
		
	}
	
	
}
