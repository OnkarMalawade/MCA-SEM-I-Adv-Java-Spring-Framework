package myPack;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
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
}
