package p10exception.p03lecture.p07custom;

public class ImageNotFoundException extends RuntimeException{ //어떤 익셉션을 받을지 잘 결정해야함
	//exception을 만들 때 주의할점 - 어떤 타입으로 만들것인지
	//1.RuntimeException(unchecked)(요즘 추세)
	//2.Exception(checked)
	
	//보통 "String message 파라미터" 받는 생성자를 만듬.
	
	public ImageNotFoundException() {
		
	}
	//파라미터가 있는 생성자는 파라미터 없는 생성자와 같이 사용 못함-> 파라미터가 없는 생성자도 같이 만들어줘야함
	public ImageNotFoundException(String message) {
		super(message);
	//이정도까지는 보통 만들어 줘야 함.	
	}
}
