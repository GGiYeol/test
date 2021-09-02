package p07extends.p03lecture.p01casting;

public class InstanceOfExample02 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		System.out.println(a1 instanceof Animal);
		System.out.println(c1 instanceof Cat);
		System.out.println(d1 instanceof Dog);
		
		System.out.println(a1 instanceof Dog); 
		System.out.println(c1 instanceof Animal);
//		System.out.println(c1 instanceof Dog); false
//		System.out.println(d1 instanceof Cat); false
	}
}
