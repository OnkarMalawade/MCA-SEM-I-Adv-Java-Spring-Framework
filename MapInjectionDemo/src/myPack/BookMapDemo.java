package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bookConfig.xml");
		BookList blObj = (BookList)ctx.getBean("bookMap");
		System.out.println(blObj);
		ctx.close();
	}
}