package Java_Practice;

public class MemberEx {

	int iv = 1;
	static int cv = 7;
	
	int iv2 = iv;
//	static int cv2 = iv; -> 클래스변수는 인스턴스 변수를 사용할 수 없다.
	static int cv2 = new MemberEx().iv; // 클래스 변수가 인스턴스 변수를 사용하려면 인스턴스를 생성해야 한다.
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv); 인스턴스 생성 후 참조 가능
		MemberEx m = new MemberEx();
		System.out.println(m.iv);
	}
	
	// 인스턴스 메서드는 클래스 메서드와 인스턴스 메서드 모두 사용 가능
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod(); 클래스 메서드가 인스턴스 메서드를 호출 하려면 인스턴스를 생성하고 호출해야 한다.
		MemberEx m = new MemberEx();
		m.instanceMethod();
	}
	
	// 인스턴스 메서드는 인스턴스 생성 없이 클래스 메서드와 인스턴스 메서드 모두 호출 가능
	void instanceMethod2() {
		staticMethod();
		instanceMethod();
	}

}
