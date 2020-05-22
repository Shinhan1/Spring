package spring_aop07_aopHW;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class CheckTime_proxy implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Date d = new Date();
		SimpleDateFormat adf = new SimpleDateFormat("YYYY/MM/dd - hh24:mm:ss");
		String useTime = adf.format(d);
		
		String pathName = "C:\\Users\\goott7-9\\Downloads\\log\\weapon2.txt";
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = invocation.proceed();
		
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













