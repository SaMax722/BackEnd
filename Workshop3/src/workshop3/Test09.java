package workshop3;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수의 최대값 구하기");
		int a = scan.nextInt();
		System.out.println("a 값: "+ a);
		int b = scan.nextInt();
		System.out.println("b 값: "+ b);
		int c = scan.nextInt();
		System.out.println("c 값: "+ c);
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최대값: " + max);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("세 정수의 최소값 구하기");
		int a1 = scan.nextInt();
		System.out.println("a1 값: " + a1);
		int b1 = scan.nextInt();
		System.out.println("b1 값: " + b1);
		int c1 = scan.nextInt();
		System.out.println("c1 값: " + c1);
		
		int min = a1;
		if(b1 < min) min = b1;
		if(c1 < min) min = c1;
		
		System.out.println("최소값: " + min);
	}

}
