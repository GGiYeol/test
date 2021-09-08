package p10exception.p03lecture.p06throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example9Multiple {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		
		method1();
	}
	//throws를 통해서 여러개의 익셉션을 나타낼 수 있다
	//1. 콤마를 통해.
	public static void method1() throws ClassNotFoundException, FileNotFoundException, IOException {
		Class.forName("");
		
		FileReader fr = new FileReader(""); //생성자.
		
		fr.close();
	}
}
