package p10exception.p02quiz;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		while (true) {
			System.out.println("첫번 째 수 입력");
			String str1 = scan.next();
			
			System.out.println("두번쩨 수 입력");
			String str2 = scan.next();
			
			int n1 = Integer.parseInt(str1);
			int n2 = Integer.parseInt(str2);
			
			System.out.println("더한결과는: " + (n1 + n2));
		}
	}
}
