package p06class.p03lecture.p01static;

public class StaticEx05ClassInstance {

	public static void main(String[] args) {
		
		Class05.method2();//static이라 바로 실행
		//Class05.method1(); 인스턴스가 없어서 실행 안됨
		
		Class05 c1 = new Class05();
		c1.method1();
	}
}

class Class05{
	//인스턴스 메소드, 맴버 메소드
	public void method1() {
		System.out.println("instance method");
	}
	
	//클래스 메소드, 스태틱 메소드
	public static void method2() {
		System.out.println("static method");
	}
}