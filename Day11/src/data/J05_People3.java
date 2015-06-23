package data;

public class J05_People3 {

	String name;
	int age;
	
	public J05_People3() {
		
	}
//	=> 기본생성자 : 매개변수가 없는 형태
//	=> 아무것도 입력하지 않아야만 객체를 생성할
//		수 있다.
	
	public J05_People3(
			String name, int age) {
		this.name = name;
		this.age = age;
	}
//	=> 재정의된 생성자 : 매개변수 정의
//	=> 정의된대로 필요 값들이 입력되어야만
//		객체를 생성할 수 있다.
	
//	=> 이와 같이,
//		생성자도 매개변수의 형태에 따라
//		서로 다른 기능들을 사용할 수 있는데,
//		이를 생성자 오버로딩이라고 한다.
	
}










