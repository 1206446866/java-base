package third;
class Person4 {
	public static void say() { // 定义静态方法
		System.out.println("Hello!");
	}
}
public class Example13 {
	public static void main(String[] args) {
		// “类名.方法”的方式调用静态方法
		Person4.say();
		// 实例化对象
		Person4 person = new Person4();
		// “实例对象名.方法”的方式来调用静态方法
		person.say();
	}
}


