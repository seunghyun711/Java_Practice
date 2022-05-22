package Java_Practice;

public class MyInfoTest {

	public static void main(String[] args) {
		
		// 인스턴스 변수 변경
		Info i1 = new Info();
		i1.year = 2022;
		i1.age = 21;
		
		Info i2 = new Info();
		i2.year = 2012;
		i2.age = 11;
		
		System.out.println(i1.year + "년 : " + "이름 : " + i1.name + "\t"+
				"height : " + i1.height + "weight : " + i1.weight);
		
		System.out.println(i2.year + "년 : " + "이름 : " + i2.name + "\t"+
				"height : " + i2.height + "weight : " + i2.weight);
		System.out.println();
		
		// 클래스 변수 값 변경
		i2.height = 170;
		i2.weight = 60;
		
		System.out.println("-------- 클래스 변수 값 변경 후 --------");
		System.out.println(i1.year + "년 : " + "이름 : " + i1.name + "\t"+
				"height : " + i1.height + "weight : " + i1.weight);
		
		System.out.println(i2.year + "년 : " + "이름 : " + i2.name + "\t"+
				"height : " + i2.height + "weight : " + i2.weight);

	}

}

class Info{
	
	int year;
	int age;
	static String name = "james";
	static int height = 178;
	static int weight = 70;
}
