package codetest;

class number{
	int base;
	int exp;
	int getValue() {
		int res=1;
		for (int i=0; i<=3;i++) {
			res=res*base;}
		return res;
		
		
	}
}

public class myExp {

	public static void main(String[] args) {
		number number1=new number();
		number number2= new number();
		number1.base=2;
		number1.exp=3;
		number2.base=3;
		number2.exp=4;
		System.out.println("2의 3승 = "+number1.getValue());
		System.out.println("3의 4승 = "+number2.getValue())
		;
		
	}

}
