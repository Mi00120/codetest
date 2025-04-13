package codetest;

import java.util.Scanner;

public class firstTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = in.nextLine();
		System.out.printf("1 번째 정수를 입력하세요: ");
		int i=in.nextInt();
		
		
		

		
		for (int b=1; b<=i; b++) {
			int all=1;
			all+=b;

			System.out.println(all);
			
		}

		
		
		
				
	
	

		
		
			

	
		

	}

}
