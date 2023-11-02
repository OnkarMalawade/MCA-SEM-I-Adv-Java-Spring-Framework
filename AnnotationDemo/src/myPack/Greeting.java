package myPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Greeting {
	private String strMsg;
	
	@Autowired
	@Value("Hello Spring")
	public void setStrMsg(String strMsg) {
	//public void setStrMsg(@Value("Hello Spring") String strMsg) {
		this.strMsg = strMsg;
	}
	
	public void greetUser() {
		System.out.println(strMsg);
	}
}
