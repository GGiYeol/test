package p10exception.p03lecture.p05throw;

public class Example1ThrowRuntimeException {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//RuntimeException을 상속받은 exception은 try/catch를 사용해도 되고 안해도 됨.
		
		NullPointerException e  = new NullPointerException();
		
		throw e;
		//이전에는 jvm이 던져줬었음
		
//		System.out.println("프로그램 종료"); 실행이 안됨.
	}
}
