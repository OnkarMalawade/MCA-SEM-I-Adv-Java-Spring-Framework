package myPack;

public class Student {
	int rollNo;
	String studNm;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String studNm) {
		super();
		this.rollNo = rollNo;
		this.studNm = studNm;
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

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studNm=" + studNm + "]";
	}
}
