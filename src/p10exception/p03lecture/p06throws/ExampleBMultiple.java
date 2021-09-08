package p10exception.p03lecture.p06throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleBMultiple {

public static void main(String[] args) throws Throwable { //exception이나 throwable을 통해 던질 수 있다.
		
		method1();
	}
	//throws를 통해서 여러개의 익셉션을 나타낼 수 있다
	//1. 콤마를 통해
	public static void method1() throws Exception { //상속에 의해 exception하나로 합칠 수 있다.
		Class.forName("");
		
		FileReader fr = new FileReader(""); //생성자.
		
		fr.close();
	}
}
