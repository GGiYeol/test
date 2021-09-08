package p10exception.p02quiz;

public class Example5 {
	//ArrayIndexOutOfBoundsException 발생 코드 작성
	public static void main(String[] args) {
		
		int[] arr = {1 ,2 ,3};
		for(int i = 0; i<arr.length; i++)
			System.out.println(arr[i]);//인덱스 범위를 넘어갔기 때문에, 인셉션이 발생한다.
		
		throw new ArrayIndexOutOfBoundsException(); //throw를 사용해도 발생한다.
	}
	
}
