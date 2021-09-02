package p07extends.p01textbook.s070702;

public class Tire {
//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxLocation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println("Tire수명: "+ (maxRotation) + "회");
			return true;
		
	} else {
		System.out.println("*** " + location + "Tire 펑크 ***");
		return false;
		}
	}
}
