package p10exception.p02quiz;

public class Example4 {

	//세가지 실행 예외를 발생시키는 코드를 만들기.
	//nullpointerexception 발생시키는 코드 만들기
	
	public static void main(String[] args) {
		String s = null;
		System.out.println(s.length());
	}
}
