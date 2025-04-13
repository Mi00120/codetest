package codetest;
import java.util.Scanner;

public class codeTest2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("등급 입력하세요: ");
		int level=in.nextInt();
		
		String levelOutput=switch(level/10) {
			case 10, 9->"A";
			case 8, 7->"B";
			case 6, 5->"C";
			case 4->"D";
			default->{System.exit(0);
			yield"";}
		};}}
		
		

