package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("AppConfig.xml");
		
		Student studObj = (Student)ctx.getBean("studBean");
		studObj.displayStudInfo();
		ctx.close();
	}

}
