package p10exception.p03lecture.p05throw;

import java.io.IOException;

public class Example2ThrowException {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		//RuntimeException을 상속받지 않은 exception은 try/catch를 사용해야함.(꼭은 아님)
		
		IOException e = new IOException();
		
		
		try {
			throw e;
		}catch (IOException e1) {
			System.out.println("IO익셉션 발생");
		}
//		throw e;  //ex1과 비교했을 때 컴파일 오류가 나느냐 안나느냐 차이다
		
	}
}
