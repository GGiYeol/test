package p10exception.p02quiz;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example8 {

	public static void main(String[] args) throws IOException {
		//try catch를 통해 잘 감싸줘야한다.
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			isr.close();
		} catch (IOException e) {
			System.out.println(e);
		System.out.println("입력 안했는데 닫지 마세요!");
			e.printStackTrace();
		}
		
		isr.close();
		throw new IOException();
	}
}
