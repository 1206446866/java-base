package third;
class Person6 {
	// ����String���͵ı���name
	String name;
	// ����int���͵ı���age
	int age;
	// �����вι��췽��
	public Person6(int a) {
		age = a;                  // Ϊage���Ը�ֵ
	}
	public Person6(String n,int a){
		name = n;                // Ϊname���Ը�ֵ
		age = a;                 // Ϊage���Ը�ֵ
	}
	// ���� speak() ����
	public void speak() {
		System.out.println("�ҽ���" + age + "����!");
	}
	// ����say()����
	public void say(){
		System.out.println("�ҽ�"+name+",����" + age + "����!");
	}
}
public class Example10 {
	public static void main(String[] args) {
		Person6 p1 = new Person6(18); 
		Person6 p2 = new Person6("����",32);
		p1.speak();
		p2.say();
	}
}


