package p10exception.p02quiz;

public class Example7 {

	//일반 예외(checked exception)을 발생시키는 코드를 작성
	public static void main(String[] args) {
		
		new Exception();
		
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
