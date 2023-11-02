package myPack;

public class Person {
	String nm, add;
	int age;
	
	
	public Person() {
		nm = "";
		add = "";
		age = 0;
	}

	public Person(String nm, String add, int age) {
		super();
		this.nm = nm;
		this.add = add;
		this.age = age;
	}

	public String getNm() {
		return nm;
	}

	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [nm=" + nm + ", add=" + add + ", age=" + age + "]";
	}
}