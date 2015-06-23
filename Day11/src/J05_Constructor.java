
import data.*;

public class J05_Constructor {
	public static void main(String[] args) {
		
		J05_People p1 = new J05_People();
		p1.setData("둘리", 12);
		System.out.println(p1.getData());
		
		
		J05_People2 p2 
			= new J05_People2("길동이", 10);
		
		
		J05_People3 p3 = new J05_People3();
		J05_People3 p4
			= new J05_People3("도우너", 15);
		
		
		
	}
}



