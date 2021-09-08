package p10exception.p02quiz;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		method1(null);
		
		System.out.println("프로그램 종료");
	}
	
	public static void method1(Object o) {
		try {// 익셉션이 발생한곳에 try-catch
		System.out.println(o.hashCode());
			} catch(NullPointerException e){
				System.out.println("널포인터익셉션 발생");
			}
		}
}
