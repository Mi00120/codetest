package codetest;

public class phoneDemo {

	public static void main(String[] args) {
		Phone myPhone=new Phone();
		myPhone.model="Galaxy S8";
		myPhone.value=100;
		myPhone.print();
		
		Phone yourPhone=new Phone();
		yourPhone.model="G6";
		yourPhone.value=85;
		yourPhone.print();
	
	}

}
class Phone{
	String model;
	int value;
	
	void print() {
		System.out.println(value+" 만원 짜리 "+ model+" 스마트폰");
	}
}