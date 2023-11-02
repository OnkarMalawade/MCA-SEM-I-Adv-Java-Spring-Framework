package myPack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GreetingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Greeting greet = ctx.getBean(Greeting.class);
		greet.setStrMsg("Hello World from Spring Annotation......");
		greet.greetUser();
		ctx.close();
	}

}
