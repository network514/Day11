package data;

public class J06_SubCla 
				extends J06_SuperCla {
	
	double height;
	
	public void setSub1(String name, 
			int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void setSub2(String name,
			int age, double height) {
		this.setData(name, age);
		this.height = height;
	}
	
	public String getSub1() {
		return "이름 : " + name + ", "
				+ "나이 : " + age + 
				", 키 : " + height;
	}
	
	public String getSub2() {
		return this.getData() + 
				", 키 : " + height;
	}
	
	
}







