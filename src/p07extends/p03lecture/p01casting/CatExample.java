package p07extends.p03lecture.p01casting;

public class CatExample {

	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		a1.walk();
		//강제로 형변환을 통해 메서드를 사용할 수 있게 해준다.
		Cat c1 = (Cat)a1;//casting 강제 형변환
		c1.punch();
		c1.walk();
	}
}
