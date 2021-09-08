package p10exception.p02quiz;

public class Example6 {

	//ClassCastException
	//억지로 타입을 변환 하려고 할 때 발생하는 exception.
	
	public static void main(String[] args) {
		String str = "java";
		method(str);
	}
	
	public static void method(Object o) {
		Number n = (Number) o;
		
		String o1 = "java";
		Object o2 = (String) o1;
//		Number n = (Number) o1;
		
		throw new ClassCastException(); //throw도 사용 가능
	
	}
}
