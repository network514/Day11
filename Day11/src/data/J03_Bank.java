package data;

public class J03_Bank {

	private String name;
	private int age;
	
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		if(a < 0) {
			System.out.println(
				"잘못된 정보입니다.");
			age = -1;  // 기본값 -1 설정함
			return;
		}
		age = a;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}








