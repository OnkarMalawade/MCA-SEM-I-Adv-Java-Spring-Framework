package myPack;

import java.util.List;

public class Question {
	int id1;
	String nm1;
	List <Answer> ans;
	
	public Question() {
		super();
	}
	public Question(int id1, String nm1, List<Answer> ans) {
		super();
		this.id1 = id1;
		this.nm1 = nm1;
		this.ans = ans;
	}
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public String getNm1() {
		return nm1;
	}
	public void setNm1(String nm1) {
		this.nm1 = nm1;
	}
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [id1=" + id1 + ", nm1=" + nm1 + ", ans=" + ans + "]";
	}
	
	
}
