package p10exception.p03lecture.p06throws;

public class Example3ClassNotFoundException {

	public static void main(String[] args) {
		
		//익셉션도 힌트를 ctrl + 1로 찾을 수 있다.
		//try catch를 통해서 적절한 오류 처리를 해야한다.
		try {
			Class.forName("aaaa");
		} catch (ClassNotFoundException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}
}
