package p10exception.p03lecture.p06throws;

public class Example4 {

	public static void main(String[] args) throws Exception {
		System.out.println("프로그램 시작");
		
		method1(); //여기서 jvm으로 던져줌. 이런 경우는 타고 타고 올라감.
		
		System.out.println("프로그램 종료");
	}
	
	public static void method1() throws Exception {
		System.out.println("메소드 1 시작");
		
		//try catch로 감싸거나, throws키워드를 써야 한다
		method2();
		 
		System.out.println("메소드 1 종료"); //도달 할 수도 있고 안할수도 있어서 익셉션이 발생할수도 있고 안할수도 있다.
	}
	public static void method2() throws Exception {
		System.out.println("메소드 2 시작");
		
		throw new Exception();
		
//		System.out.println("메소드 2 종료");
	}
	
}
