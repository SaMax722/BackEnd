package workshop3;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		System.out.println("2자리의 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		do {
			System.out.print("입력 :");
			a = scan.nextInt();
		}while(a < 10 || a > 99);
		
		System.out.println("입력값은 " + a);
	}
	
}
