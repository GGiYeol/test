package p10exception.p03lecture.p06throws;

import java.io.IOException;

public class Example7Casting {

	public static void main(String[] args) {
		//try catch . 다형성
		try {
		throw new NullPointerException();
			}catch (Exception e) {
				System.out.println("익셉션 발생");
			}
		}
//	public static void method1() throws IOException { 
	public static void method1() throws Exception { //다형성 때문에 더 큰 범주로 감싸줘도 된다.
		throw new IOException();
	}
	
}
