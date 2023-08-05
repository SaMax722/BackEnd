package workshop3;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수 구하기");
		
		int a = 0;
		do {
			System.out.print("정수값: ");
			a = scan.nextInt();
		}while (a <= 0);
		
//		int n = 0;
//		while(n > 0) { // 자릿수
//			n /= 10;
//			n++;
//		}
		int length = (int)(Math.log10(a)+1); // 자릿수
		
		System.out.println("그 수는 " + length + "자리입니다.");
	}	

}
