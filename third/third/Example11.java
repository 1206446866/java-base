package third;
class Person5 {
	public Person5() {
		System.out.println("无参的构造方法被调用了...");
	}
	public Person5(int age) {
		this();                    // 调用无参的构造方法
		System.out.println("有参的构造方法被调用了...");
	}
}
public class Example11 { 
	public static void main(String[] args) {
		Person5 p = new Person5(18); // 实例化 Person 对象
	}
}


