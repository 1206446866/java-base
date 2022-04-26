package third;
class Person7 {
	// 声明int类型的变量age
	int age;
	// 定义有参构造方法
	public Person7(int a) {
		age = a;                  //为age属性赋值
	}
	// 定义 speak() 方法
	public void speak() {
		System.out.println("我今年" + age + "岁了!");
	}
}
public class Example09 {
	public static void main(String[] args) {
		Person7 p = new Person7(18); // 实例化Person对象
		p.speak();
	}
}


