package p10exception.p03lecture.p05throw;

public class Example3 {

	public static void main(String[] args) {
		//일반예외(checked exception) :
		//Exception중에 RuntimeException을 상속받지 않은 것
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("익셉션 발생");
		}
		
		
		//실행예외(unchecked exception) : 
		//Exception중에 RuntimeException을 상속받은 것

		
		throw new RuntimeException();
		
	
	}
}



//return : 1. 메소드 종료  2. 오른쪽 값 반환
//throw : 1. 예외객체 던짐(throw) -> catch한 곳에서 처리 해야함.(프로그램 종료/실행 계속)
//오른쪽에 있는 예외객체를 다른 곳으로 던짐.