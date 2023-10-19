package mypack;

import java.util.List;

public class Question {
	int id;
	String que;
	List<String> ans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	public Question(int id, String que, List<String> ans) {
		super();
		this.id = id;
		this.que = que;
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", que=" + que + ", ans=" + ans + "]";
	}
	public Question() {
		super();
	}
	
	
}
