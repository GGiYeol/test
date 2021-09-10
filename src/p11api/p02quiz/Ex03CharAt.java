package p11api.p02quiz;

import java.util.Scanner;

public class Ex03CharAt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.print("입력: ");
			String in = scan.next();
			int a = in.length() / 2;
			System.out.println("가운데 글자는 " + in.charAt(a));
		}
		
	}


}
