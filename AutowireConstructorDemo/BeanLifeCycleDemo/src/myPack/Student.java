package myPack;

public class Student {
	int rollNo;
	String studNm;
	
	public Student() {
		super();
		System.out.println("Step 1: Bean Instantiation");
	}
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getStudNm() {
		return studNm;
	}
	
	public void setStudNm(String studNm) {
		this.studNm = studNm;
	}
	
	public void initMethod() {
        System.out.println("Step 2: Bean Initialization Method");
    }
	
	public void displayStudInfo() {
        System.out.println("Step 3: Display Student Info - ");
        System.out.println("Roll No - " + rollNo);
        System.out.println("Name - " + studNm);
    }

    public void destroyMethod() {
        System.out.println("Step 4: Bean Destruction Method");
    }
}