package third;
class Person3{
	static {
		System.out.println("执行了Person类中的静态代码块");
	}
}
public class Example14{
	static{
		System.out.println("执行了测试类中的静态代码块");
	}
	public static void main(String[] args){
		// 实例化2个Person对象
		Person3 p1 = new Person3();
		Person3 p2 = new Person3();
	}
}

