
import data.*;

public class J02_setget_main {
	public static void main(String[] args) {
		
//		인사정보 클래스 : 이름, 나이
		
		J02_SetGet peo1 = new J02_SetGet();
//		에러 : peo1.name= "둘리";
//		에러 : peo1.age = 10;
//		=> 두 멤버변수에 private으로 은닉화 처리됨
		
		peo1.setName("둘리");
		peo1.setAge(10);
//		=> 저장하기 위해서는 위와 같이 메소드를
//			이용하도록 한다.
		
		/* 에러 : 
		System.out.println(
			peo1.name + "의 나이는 "
			+ peo1.age + "살 입니다.");
		*/
		
		System.out.println(
			peo1.getName() + "의 나이는 "
			+ peo1.getAge() + "살 입니다.");
		
		
		
	}
}







