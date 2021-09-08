package p10exception.p03lecture.p06throws;

import java.io.IOException;

public class Example8 {

	public static void main(String[] args) {
	
		//try - catch, throws
		try {
			method1();
		} catch (Exception e) { //다형성을 통해 exception으로 가능
			e.printStackTrace();
		}
		try {
			method2();
		} catch (Exception e) { //IOExeption은 불가능하다. throws는 exception으로 명시되어 있기 때문에
			// 하위 익셉션으로 넘길 수 없다.
//			e.printStackTrace();
			System.out.println(e instanceof Exception);
			System.out.println(e instanceof IOException); 
		}
	}
	public static void method1() throws IOException {
		throw new IOException();
	}
	
	public static void method2() throws Exception {
		throw new IOException();
	
	}
}
