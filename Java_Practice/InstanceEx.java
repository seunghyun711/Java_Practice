package Java_Practice;

class Phone{
	String call; // ��ȭ
	String message; // �޽��� 
	
	
	//Phone�� ��� 
	void call(){
		System.out.println("��ȭ�ɱ�");
	}
	void message() {
		System.out.println("�޽��� ������");
	}
	
}
public class InstanceEx {
	public static void main(String[] args) {
		Phone p = new Phone();
		
		p.call();
		p.message();
		
		
	}

}



