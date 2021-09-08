package p10exception.p03lecture.p06throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleAMultiple {

public static void main(String[] args)  {
		
		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//다형성을 이용하거나 multicatch로 잡을 수 있다.
		
		try {
			method1();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//throws를 통해서 여러개의 익셉션을 나타낼 수 있다
	//1. 콤마를 통해.
	public static void method1() throws ClassNotFoundException, FileNotFoundException, IOException {
		Class.forName("");
		
		FileReader fr = new FileReader(""); //생성자.
		
		fr.close();
	}
}
