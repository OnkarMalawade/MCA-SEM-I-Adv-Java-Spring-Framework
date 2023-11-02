package anotherEx;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Driver driverObj;
	
	@PostConstruct
    public void init() {
        // Perform additional initialization, set up references, etc.
		System.out.println("Called Automatically..");
		driverObj.setCarObj(this);
    }
	
	public Driver getDriverObj() {
		return driverObj;
	}
	
	void setDriverObj(Driver driverObj) {
		this.driverObj = driverObj;
	}

	@Override
	public String toString() {
		return "Car [driverObj=" + driverObj + "]";
	}
}