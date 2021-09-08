package p10exception.p03lecture.p06throws;

public class Example1Throws {

	
	public static void main(String[] args) throws Exception {
		//예외처리의 다른 방법. throws 키워드 활용
		//throws를 호출한 메소드에게 명시해주면 됨.
		throw new Exception(); //runtime exception을 상속받지 않았기 때문에, 일반 익셉션이다.
		//main 메소드는 jvm이 호출하고 처리함.
		
	}
}
