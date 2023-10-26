package myPack;

public class Customer {
	Person p;
	Address add;
	int type;
	String action;
	public Customer() {
		super();
	}
	public Customer(Person p, Address add, int type, String action) {
		super();
		this.p = p;
		this.add = add;
		this.type = type;
		this.action = action;
	}
	@Override
	public String toString() {
		return "Customer [p=" + p + ", add=" + add + ", type=" + type + ", action=" + action + "]";
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}

}
