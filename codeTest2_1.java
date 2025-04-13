package codetest;
import java.util.Scanner;
public class codeTest2_1 {
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	System.out.println("1번째 수를 입력하세요: ");
		int s1=in.nextInt();
		
		System.out.println("2번째 수를 입력하세요: ");
		int s2=in.nextInt();
		
		System.out.println("3번째 수를 입력하세요: ");
		int s3=in.nextInt();
        
        System.out.println("교환전: " + s1 + " " + s2 + " " + s3);
        
        int[] swap = change(s1, s2, s3);
        
        System.out.println("교환후: "+ + swap[0] + " " + swap[1] + " " + swap[2]);}
        
    public static int[] change(int s1, int s2, int s3) {
            return new int[]{s3, s1, s2};
    }
    

}
