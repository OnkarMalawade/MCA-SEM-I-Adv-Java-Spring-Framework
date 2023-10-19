package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingerDemo {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("singerConfig.xml");
		Singer s1 = (Singer) ctx.getBean("singBean");
		System.out.println(s1);
		s1.setAge(10);
		s1.setName("Abdullah");
		System.out.println(s1);
	}

}
