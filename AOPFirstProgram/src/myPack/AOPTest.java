package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("appCtx.xml");
		Operation op = (Operation) ctx.getBean("operationBean");
		System.out.println("Calling Displaying Method of displayMsg()...");
		op.displayMsg("Hello World.....");
	}

}
