package p10exception.p03lecture.p02try_catch;

public class Example4ExceptionInstance {

	public static void main(String[] args) {
		System.out.println("프러그렘 시작");
		int [] arr = {3,2,6};
		
		try {
		System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("어레이인덱스아웃보으바운즈인겝션 발생");
			e.printStackTrace();
			
		
			System.out.println("메세지:" + e.getMessage());
			System.out.println("원인:" + e.getCause());
		}
		
		System.out.println("프로그램 종료");
	}
}
