package p10exception.p02quiz;

import java.io.FileNotFoundException;

public class Example7_t {

	public static void main(String[] args) {
		try {
		throw new FileNotFoundException(); //runtime exception을 상속받지 않음.
		} catch(FileNotFoundException e) {
			System.out.println("파일 못 찾음");
		}
		
	}
}
