package p07extends.p03lecture.p01casting;

public class InstanceOfExample {

	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		if(a1 instanceof Cat) {
		Cat c1 = (Cat) a1;
		c1.punch();
		}
		
		if(a2 instanceof Cat) {//false 여서 실행이 되지 않아서 정상적으로 작동됨
		Cat c2 = (Cat) a2;//instanceof는 앞의 것이 뒤에 있는 인스턴스와 같은지를 판별(boolean type)
		c2.punch();
		}
		System.out.println("프로그램 정상 종료");
	
	}
}