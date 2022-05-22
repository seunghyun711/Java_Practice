package Java_Practice;

class Phone{
	String call; // 전화
	String message; // 메시지 
	
	
	//Phone의 기능 
	void call(){
		System.out.println("전화걸기");
	}
	void message() {
		System.out.println("메시지 보내기");
	}
	
}
public class InstanceEx {
	public static void main(String[] args) {
		Phone p = new Phone();
		
		p.call();
		p.message();
		
		
	}

}



