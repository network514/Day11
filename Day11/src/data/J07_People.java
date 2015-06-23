package data;

public class J07_People {
	
	String name;
	int age;
	
	public void setPeople(String name,
							int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getPeople() {
		return "이름 : " + name + 
				", 나이 : " + age; 		
	}
}