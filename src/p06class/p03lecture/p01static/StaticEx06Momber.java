package p06class.p03lecture.p01static;

public class StaticEx06Momber {
//스테틱에 인스턴스를 집어 넣을 수 없다
//스태틱(클래스) 맴버(매소드,필드)에서는
//인스턴스 맴버(메소드, 필드) 접근 불가
	
	public int val1;
	public static int val2;
	
	public void method1() {
		System.out.println(val1);
		System.out.println(val2);
	}
	
	public static void method2() {
		System.out.println(val2);
//		System.out.println(val1);
	}
}
