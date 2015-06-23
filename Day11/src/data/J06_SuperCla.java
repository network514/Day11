package data;

public class J06_SuperCla {
	
	String name;
	int age;
	
	public void setData(
			String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getData() {
		return "이름 : " + name + ", "
				+ "나이 : " + age;
	}
	
}
