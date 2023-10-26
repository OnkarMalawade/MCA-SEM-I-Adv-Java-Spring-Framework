package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("appConfig.xml");
		Customer c1 = (Customer) ctx.getBean("custBean1");
		System.out.println(c1);
		Customer c2 = (Customer) ctx.getBean("custBean2");
		System.out.println(c2);
		Customer c3 = (Customer) ctx.getBean("custBean3");
		System.out.println(c3);
	}

}
