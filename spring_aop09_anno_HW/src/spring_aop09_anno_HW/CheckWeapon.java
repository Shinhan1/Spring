package spring_aop09_anno_HW;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class CheckWeapon {
	
	@Pointcut("execution (public * fire ())")
	public void publicPointCut() {}
	
	@AfterReturning("publicPointCut()")
	public Object logAround(JoinPoint pjp) throws Throwable {
		Date d = new Date();
		SimpleDateFormat adf = new SimpleDateFormat("YYYY/MM/dd - hh24:mm:ss");
		
		// ProceedingJoinPoint는 aop:around에서만  지원한다
		
		String useTime = adf.format(d);
		
		
		
		String pathName = "C:\\Users\\goott7-9\\Downloads\\log\\weapon3.txt";
		
		
		Object obj = ((ProceedingJoinPoint)pjp).proceed();
		
		File f = new File(pathName);
		
		if(!f.exists()) {
			f.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(f);
		pw.println(useTime + " : 무기사용 시각");
		pw.flush();
		pw.close();
		
		return obj;
		
	}
}
