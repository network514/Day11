
import data.*;

public class J04_This_main {
	public static void main(String[] args) {
		
//		자동차 정보 클래스
		
		J04_Car c1 = new J04_Car();
		c1.setData("슈퍼카", 20);
		System.out.println(
			c1.getName() + "의 가격은 "
			+ c1.getPrice() + "원 입니다.");
		
		
		J04_Car p1 = new J04_Car();
		J04_Car p2 = new J04_Car();
		System.out.println("p1 : " + p1);
		p1.setData("슈퍼카", 10);
		System.out.println("p2 : " + p2);
		p2.setData("고물차", 100);
		
		
		
		
		
		
		
		
	}
}










