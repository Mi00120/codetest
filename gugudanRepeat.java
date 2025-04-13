package codetest;
import java.util.Scanner;

public class gugudanRepeat {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("출력하고자 하는 구구단: ");
		int dan;
		int i=1;
		while((dan=in.nextInt())!=0) {
			for (int i=1; i<9; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
			System.out.print()));
		}
		

	}

}
