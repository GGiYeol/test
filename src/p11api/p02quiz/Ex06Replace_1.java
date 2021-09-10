package p11api.p02quiz;

import java.util.Scanner;

public class Ex06Replace_1 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		
		String str = scan.nextLine();
		while (str.indexOf(" ") != -1) {
			
		}
//		System.out.println(str.replace(" ",""));
		System.out.println(str.trim().replace(" ",""));
		
		
		scan.close();
	}
}
