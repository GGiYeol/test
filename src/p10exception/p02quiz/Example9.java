package p10exception.p02quiz;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example9 {

	public static void main(String[] args) throws IOException {
		
		method1();
	}

	private static void method1() throws IOException {
		method2();
	}

	private static void method2() throws IOException {
		method3();
	}

	private static void method3() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		//try catch로 감싸거나, throws로 던지기.
		//컴파일 오류만 해결. 프로그램이 정상적으로 작동하게 만든 것은 아님.
		is.close();
	}
}
