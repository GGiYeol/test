package p07extends.p03lecture.p01casting;

public class DogExample {

	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		a1.walk();
		Cat c1 = (Cat) a1;
		c1.punch();
		//dog는 animal이라고 할 수 있지만, cat은 dog이라고 할 수 없기때문에
		//강제 형 변환은 주의해서 써야 한다.
		System.out.println("프로그램 정상 종료");
	}
}
