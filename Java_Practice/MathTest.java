package Java_Practice;

class Math{
	long x, y;
	
	// 인스턴스 메서드
	long add() {return x + y;}		// 덧셈
	long sub() {return x - y;}		// 뺄셈
	long mul() {return x * y;}		// 곱셈
	double div() {return x / y;}	// 나눗셈
	
	// 클래스 메서드
	static long add(long x, long y) {return x + y;}
	static long sub(long x, long y) {return x - y;}
	static long mul(long x, long y) {return x * y;}
	static double div(double x, double y) {return x / y;}
}

public class MathTest {

	public static void main(String[] args) {
		
		
		// 클래스 메서드 호출 -> 인스턴스 생성 없이 호출 
		System.out.println("======= 클래스 메서드 호출 =======");
		System.out.println(Math.add(250L, 180L));
		System.out.println(Math.sub(250L, 180L));
		System.out.println(Math.mul(250L, 180L));
		System.out.println(Math.div(250.0, 180.0));
		System.out.println();
		
		// 인스턴스 메서드 호출 -> 인스턴스 생성 후 호출
		Math m = new Math();
		m.x = 250L;
		m.y = 180L;
		
		System.out.println("======= 클래스 메서드 호출 =======");
		System.out.println(m.add());
		System.out.println(m.sub());
		System.out.println(m.mul());
		System.out.println(m.div());

	}

}
