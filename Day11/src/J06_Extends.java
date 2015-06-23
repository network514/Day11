
import data.*;

public class J06_Extends {
	
//	클래스의 상속
//	- 기존에 존재하는 클래스의 데이터 구조 및 
//		기능에 대하여, 새로 만들려는 클래스가
//		기존의 클래스의 모든 내용을 그대로
//		물려받는 처리 기법
//	- 상속을 통해서 기존에 존재하는 클래스를
//		확장, 수정하는 작업이 수월해진다.
//	- 기존에 존재하는 클래스를 부모클래스, 
//		수퍼클래스 등으로 부르고,
//		새로 만들어서 내용을 물려받는 클래스를
//		자식클래스, 서브클래스 등으로 부른다.
	
	public static void main(String[] args) {
		
		J06_SubCla sub = new J06_SubCla();
		
		sub.setData("서브클래스가입력", 10);
		System.out.println(sub.getData());
		
		
		
	}
	
}










