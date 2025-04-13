package codetest;
import java.util.Scanner;
public class rps1test {

	public static void main(String[] args) {
		//System.out.print("철수:");
		//String a=in.next();
		//System.out.print("영희:");
		//String b=in.next();

		String a= input("철수");
		String b= input("영희");
		whoIsWin(a, b);
	}
	static String input(String s) {
		Scanner in=new Scanner(System.in);
		System.out.print(s+": ");
		String ss=in.next();
		return ss;
		return in.next();
	}
	static void whoIsWin(String s1, String s2) {
		
		if(s1.equals(s2)) {
			System.out.println("우승");}
		else if(s1.equals("r")){
			if (s2.equals("p")) {
				System.out.println("철수 승");}
			else if (s1.equals("s")) {
				System.out.println("영희 승");}
		else if(s1.equals("p")){
			if (s2.equals("s")) {
				System.out.println("철수 승");}
			else if (s2.equals("r")) {
				System.out.println("영희 승");}
		else if(s1.equals("s")){
			if (s2.equals("r")) {
				System.out.println("철수 승");}
			else if (s2.equals("p")) {
				System.out.println("영희 승");}
		
			}
		}
			

	}

}}
