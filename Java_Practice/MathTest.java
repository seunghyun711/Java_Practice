package Java_Practice;

class Math{
	long x, y;
	
	// �ν��Ͻ� �޼���
	long add() {return x + y;}		// ����
	long sub() {return x - y;}		// ����
	long mul() {return x * y;}		// ����
	double div() {return x / y;}	// ������
	
	// Ŭ���� �޼���
	static long add(long x, long y) {return x + y;}
	static long sub(long x, long y) {return x - y;}
	static long mul(long x, long y) {return x * y;}
	static double div(double x, double y) {return x / y;}
}

public class MathTest {

	public static void main(String[] args) {
		
		
		// Ŭ���� �޼��� ȣ�� -> �ν��Ͻ� ���� ���� ȣ�� 
		System.out.println("======= Ŭ���� �޼��� ȣ�� =======");
		System.out.println(Math.add(250L, 180L));
		System.out.println(Math.sub(250L, 180L));
		System.out.println(Math.mul(250L, 180L));
		System.out.println(Math.div(250.0, 180.0));
		System.out.println();
		
		// �ν��Ͻ� �޼��� ȣ�� -> �ν��Ͻ� ���� �� ȣ��
		Math m = new Math();
		m.x = 250L;
		m.y = 180L;
		
		System.out.println("======= Ŭ���� �޼��� ȣ�� =======");
		System.out.println(m.add());
		System.out.println(m.sub());
		System.out.println(m.mul());
		System.out.println(m.div());

	}

}
