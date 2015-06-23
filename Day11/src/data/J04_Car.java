package data;

public class J04_Car {
	
	String name;
	int price;
	
	public void setData(
			String name, int price) {
		System.out.println("this : " + this);
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	
}







