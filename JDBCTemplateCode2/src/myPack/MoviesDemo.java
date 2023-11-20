package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoviesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("App.xml");
		MovieDAO m1 = (MovieDAO)appCon.getBean("movieBean1");
		Movies mo1 = new Movies();
		mo1.setMid(1);
		mo1.setActor("ShahRukh Khan");
		mo1.setTitle("Pathhaan");
		
		int noOfRowsAffected = m1.saveMovie(mo1);
		if(noOfRowsAffected != 0) {
			System.out.println("Movie Data");
		}else {
			System.out.println("Error....");
		}
		appCon.close();
	}

}
