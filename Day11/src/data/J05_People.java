package data;

public class J05_People {

	String name;
	int age;
	
//	생성자
//	1. 클래스를 작성하면, 자동으로 만들어지고
//		눈에 보이지 않는 형태로 숨겨져 있다.
//	2. 리턴자료형이 없는 특별한 메소드의 형태로
//		객체가 만들어질 때 자동으로 호출된다.
//	3. 객체를 만든 이후로는 호출할 수 없다.
//	4. 형식 : 
//		public 클래스이름() {
//		
//		}
//		=> 클래스의 이름과 같고, 위와 같은 형태로
//			존재하는 생성자를 기본생성자라 한다.
//	5. 기본적으로 생성자는 public 상태이며,
//		public이여야만 객체를 생성할 수 있다.
	
	public J05_People() {
		System.out.println("기본(디폴트)"
				+ "생성자가 호출됨");
	}
	
	
	
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







