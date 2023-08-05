package workshop3;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 자리 정수값을 입력하시오");
		int numberValue = scan.nextInt();
		int resultValue = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % numberValue == 0) {
				resultValue += i;
				if((i != numberValue))
				System.out.println("+");
				System.out.println(i);
			}
		}
		System.out.println(" = " + resultValue);
	}

}
