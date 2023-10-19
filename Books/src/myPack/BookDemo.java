package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bookConfig.xml");
		BookList blObj = (BookList) ctx.getBean("bookBean");
		System.out.println(blObj);
		ctx.close();
	}

}
