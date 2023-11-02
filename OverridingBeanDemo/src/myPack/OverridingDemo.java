package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new 
				ClassPathXmlApplicationContext("AppContext.xml");
		Mobile mobObj = (Mobile) ctx.getBean("mobBean");
		System.out.println(mobObj);
		
		System.out.println("Override the bean defination....");
		ctx=new ClassPathXmlApplicationContext("override.xml");
		mobObj = (Mobile) ctx.getBean("mobBean");
		System.out.println(mobObj);
	}
}
