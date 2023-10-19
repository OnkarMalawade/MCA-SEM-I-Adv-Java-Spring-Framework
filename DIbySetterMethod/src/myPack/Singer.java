package myPack;

public class Singer {
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Singer(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Singer() {
		super();
	}
	@Override
	public String toString() {
		return "Singer [age=" + age + ", name=" + name + "]";
	}
	
}
