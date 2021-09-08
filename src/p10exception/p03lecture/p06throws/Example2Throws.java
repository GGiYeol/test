package p10exception.p03lecture.p06throws;

import java.io.FileNotFoundException;

public class Example2Throws {

	public static void main(String[] args) {
		//두가지 선택권이 생김. try.catch 나 throws + 발생된 익셉션
		
		//1. try catch로 감싸기.
		try {
		method1();
		} catch(FileNotFoundException e){
			System.out.println("파일을 못 찾았데.......");
		}
	}
	
	
	public static void method1() throws FileNotFoundException{
		//컴파일 오류를 피하기 위해 try.catch 나 throws + 발생된 익셉션
		throw new FileNotFoundException();
	}
}
