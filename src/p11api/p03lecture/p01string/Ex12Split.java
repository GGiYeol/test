package p11api.p03lecture.p01string;

public class Ex12Split {

	public static void main(String[] args) {
		
		String str = "java,spring,html,css";
		
		String[] arr = str.split(",");
		for(String item : arr) {
			System.out.println(item);
		}
	}
}
