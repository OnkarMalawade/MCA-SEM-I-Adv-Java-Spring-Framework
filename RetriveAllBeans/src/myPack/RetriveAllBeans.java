package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RetriveAllBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new 
					ClassPathXmlApplicationContext("appctx.xml");
		String beanNames[] = ctx.getBeanDefinitionNames();
		for(String beanNm:beanNames) {
			Student stuObj = (Student) ctx.getBean(beanNm);
			System.out.println(stuObj);
		}
		ctx.close();
	}
}