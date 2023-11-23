package myPack;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPClass {
	@Pointcut("execution(public void Operation.displayMsg(..))")
	public void pointcutMethod() {
		
	}
	
	@After("pointcutMethod()")
	public void logAsPerPointcutExp() {
		Calendar cal = Calendar.getInstance();
		System.out.println("Logging Aspect: Demo of pointcut expression.");
		Logger log = Logger.getLogger("");
		log.log(Level.INFO,"**** Inside of logAsPerPointcutExp() Method **** at " + cal.getTime());
	}
	
	//@Before("execution(public void Operation.displayMsg(..))")
	//@Before("within(myPack.*)")
	//@Before("args(java.lang.String)")
	//@AfterReturning("execution(public void Operation.*(..))")gs
	//@After("args(java.lang.String)")
	@After("bean(operationBean)")
	public void callMe(JoinPoint jp) {
		System.out.println("Inside the AOPClass....1");
		String packageName = jp.getSignature().getDeclaringTypeName();
		String methodName = jp.getSignature().getName();
		System.out.println("Exiting Method [" + packageName + "." + methodName + "]; " );
	}
	
	@Before("target(myPack.AOPInterface)")
	public void targetCall(JoinPoint jp) {
		System.out.println("Inside the AOPClass....2");
		String packageName = jp.getSignature().getDeclaringTypeName();
		String methodName = jp.getSignature().getName();
		System.out.println("Exiting Method [" + packageName + "." + methodName + "]; " );
	}
}
