package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("personConfig.xml");
		Person personObj = (Person)ctx.getBean("personBean");
		System.out.println(personObj);
		ctx.close();
	}

}
