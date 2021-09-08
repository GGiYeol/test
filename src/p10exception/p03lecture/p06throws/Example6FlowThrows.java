package p10exception.p03lecture.p06throws;

public class Example6FlowThrows {


	public static void main(String[] args) throws Exception {
		System.out.println("프로그램 시작");
		//catch를 안해서 jvm으로 넘어감.
		//exception을 잡지 않고 다른 곳으로 넘김.
		method1();
		System.out.println("프로그램 종료");
		
	}
	
	public static void method1() throws Exception{
		throw new Exception();
	}
	
}
