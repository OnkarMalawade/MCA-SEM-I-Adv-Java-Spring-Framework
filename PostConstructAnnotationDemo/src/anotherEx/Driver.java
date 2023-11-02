package anotherEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Driver {
	private Car carObj;
	
	@Autowired
	Driver(Car carObj) {
		super();
		this.carObj = carObj;
	}
	
	public Car getCarObj() {
		return carObj;
	}
	
	public void setCarObj(Car carObj) {
		this.carObj = carObj;
	}
	
	@Override
	public String toString() {
		return "Driver [carObj=" + carObj + "]";
	}
}