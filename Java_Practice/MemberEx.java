package Java_Practice;

public class MemberEx {

	int iv = 1;
	static int cv = 7;
	
	int iv2 = iv;
//	static int cv2 = iv; -> Ŭ���������� �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberEx().iv; // Ŭ���� ������ �ν��Ͻ� ������ ����Ϸ��� �ν��Ͻ��� �����ؾ� �Ѵ�.
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv); �ν��Ͻ� ���� �� ���� ����
		MemberEx m = new MemberEx();
		System.out.println(m.iv);
	}
	
	// �ν��Ͻ� �޼���� Ŭ���� �޼���� �ν��Ͻ� �޼��� ��� ��� ����
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod(); Ŭ���� �޼��尡 �ν��Ͻ� �޼��带 ȣ�� �Ϸ��� �ν��Ͻ��� �����ϰ� ȣ���ؾ� �Ѵ�.
		MemberEx m = new MemberEx();
		m.instanceMethod();
	}
	
	// �ν��Ͻ� �޼���� �ν��Ͻ� ���� ���� Ŭ���� �޼���� �ν��Ͻ� �޼��� ��� ȣ�� ����
	void instanceMethod2() {
		staticMethod();
		instanceMethod();
	}

}
