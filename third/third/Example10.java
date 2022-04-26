package third;
class Person6 {
	// 声明String类型的变量name
	String name;
	// 声明int类型的变量age
	int age;
	// 定义有参构造方法
	public Person6(int a) {
		age = a;                  // 为age属性赋值
	}
	public Person6(String n,int a){
		name = n;                // 为name属性赋值
		age = a;                 // 为age属性赋值
	}
	// 定义 speak() 方法
	public void speak() {
		System.out.println("我今年" + age + "岁了!");
	}
	// 定义say()方法
	public void say(){
		System.out.println("我叫"+name+",今年" + age + "岁了!");
	}
}
public class Example10 {
	public static void main(String[] args) {
		Person6 p1 = new Person6(18); 
		Person6 p2 = new Person6("张三",32);
		p1.speak();
		p2.say();
	}
}


