package advice;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class MethodAfter_Advice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// OS에 파일로 그 결과를 저장해두기
		// C:\Users\goott7-9\Downloads\log\오늘날짜.txt
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddhh24mmss");
		String fileName = sdf.format(d);
		
		// 디렉토리 생성
		String dir = "C:\\Users\\goott7-9\\Downloads\\log";
		
		File f = new File(dir);
		
		// 파일 객체 생성
		// new file(디렉토리 + 파일이름 + 확장자)
		File f2 = new File(dir + "\\" + fileName + ".txt");
//		FileWriter fw = new FileWriter(f2, true);
		
		
		// 파일, 디렉토리가 존재하지 않으면 생성
		if(!f.exists()) {
			f.mkdir();
		}
		
		if(!f2.exists()) {
			f2.createNewFile();
		}
		
		// 추가로 파일에 저장해서 출력해보세요
		// '파일이름' 저장되었습니다
		// '10000' 이체되었습니다.
		
//		fw.write(fileName + " 저장되었습니다.");
//		fw.write(args[0] + "원 이체되었습니다.");
//		System.out.println(fileName + " 저장되었습니다.");
//		System.out.println(args[0] + "원 이체되었습니다.");
//		fw.flush();
		
		PrintWriter pw = new PrintWriter(f2);
		pw.println(fileName + " 저장되었습니다.");
		pw.println(args[0] + "원 이체되었습니다.");
		pw.flush();
		pw.close();
		
		// 이런식으로 생성하는 것이 로그 기록의 일종 => 감사자료 ...
		
		
		// 매개 변수 출력
//		System.out.println("returnValue : " + returnValue);
//		System.out.println("method : " + method.getName());
//		System.out.println("args : " + args[0]);
//		System.out.println("target : " + target.getClass().getName());
		
	}
}
