
import data.J01_ModCla_extra;

public class J01_Mod_main {
	public static void main(String[] args) {
		
//		접근제한자(Modifier)
//		- private < (default) < protected 
//			< public
//		- 클래스 멤버에 대한 시야 설정 키워드
//		- 객체 지향 설계에서의 은닉화(hiding)
//			기법을 직접적으로 수행하는 명령
//		- private : 
//			1. 동일 클래스에서만 접근 가능
//			2. 외부에서는 무조건 접근 불가능
//			3. 이용하기 위해서는 public상태로
//				접근 중간자 역할을 하는
//				setter/getter메소드가 필요하다.
//			4. 객체지향 설계 관점에서 은닉화를 
//				위해 클래스의 멤버 변수에는
//				무조건 private을 적용한다.
//		- (default)
//			1. 아무것도 입력되지 않은 기본 상태를
//				디폴트 상태라 한다.
//			2. 접근 허용 범위
//				- 같은 클래스 접근 가능
//				- 같은 패키지에 있는 
//					다른 클래스에서 접근 가능
//				- 다른 패키지에 있는 
//					다른 클래스에서 접근 불가능
//		- protected
//			1. 접근 허용 범위
//				- 같은 클래스에서 접근 가능
//				- 같은 패키지 다른 클래스에서
//					접근 가능
//				- 다른 패키지 다른 클래스에서
//					접근 불가능
//				- 단, 상속관계에 있는 클래스에
//					대해서는 다른 패키지의
//					다른 클래스라 하더라도
//					접근 허용
//		- public 
//			1. 무조건 접근 허용
		
		
		J01_ModCla acc1 = new J01_ModCla();
		
//		에러 : System.out.println(acc1.priv);
//		=> private으로 은닉화된 변수 접근 불가
		
		
		System.out.println(acc1.def);
		
		J01_ModCla_extra acc2
			 = new J01_ModCla_extra();
//		에러 : System.out.println(acc2.def);
		
		
		System.out.println(acc1.prot);
//		에러 : System.out.println(acc2.prot);
		
		
		System.out.println(acc1.pub);
	}
}
















