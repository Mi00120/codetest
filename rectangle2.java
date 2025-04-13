package codetest;

class rectangle1 {
	int width=10;
	int length=50;
	int calc_area() {
		return width*length;
	}
}
public class rectangle2 {

	public static void main(String[] args) {
		rectangle1 rec = new rectangle1();
		System.out.println("площадь треугольника: "+ rec.calc_area());

}
}