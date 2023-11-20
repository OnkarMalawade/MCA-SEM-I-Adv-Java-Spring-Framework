package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoviesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("App.xml");
		MovieDAO m1 = (MovieDAO)appCon.getBean("movieBean1");
		Movies mo1 = new Movies();
		mo1.setMid(1);
		mo1.setActor("Sallu Bhai");
		mo1.setTitle("Tiger 7");
		
		int noOfRowsAffected = m1.saveMovie(mo1);
		if(noOfRowsAffected != 0) {
			System.out.println("Movie Data Inserted");
		}else {
			System.out.println("Error....");
		}
		m1.getAllMoviesList();
		appCon.close();
	}

}
