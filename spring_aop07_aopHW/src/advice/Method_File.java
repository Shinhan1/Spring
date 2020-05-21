package advice;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class Method_File implements AfterReturningAdvice {
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddhh24mmss");
		String fileName = sdf.format(d);
		
		String dir = "C:\\Users\\goott7-9\\Downloads\\log";
		
		File f = new File(dir);
		
		File f2 = new File(dir + "\\" + fileName + ".txt");
		
		if(!f.exists()) {
			f.mkdir();
		}
		
		if(!f2.exists()) {
			f2.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(f2);
		pw.println(fileName + " 저장되었습니다.");
//		pw.println(args[0] + "원 이체되었습니다.");
		System.out.println(returnValue);
		pw.flush();
		pw.close();
		
		
		
	}
	
}
