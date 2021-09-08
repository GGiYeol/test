package p06class.p03lecture.p01static;

public class StaticEx01Field {
	public static void main(String[] args) {
		Class01.id = 3;
		System.out.println(Class01.id);
		
		Class01 c1 = new Class01();
		Class01 c2 = new Class01();
		
		System.out.println(c1.id);
		System.out.println(c2.id);
	}
}

class Class01{
	//인스턴스를 만들지 않아도 사용할 수 있다.
	//모든 인스턴스를 공유한다.
	//static field(정적멤버변수, 정적 필드, 스태틱 필드)
	//클래스 변수
	//static을 쓰면 클래스로 바로 접근할 수 있다.
	static int id;
	
}