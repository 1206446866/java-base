package third;
class Person7 {
	// ����int���͵ı���age
	int age;
	// �����вι��췽��
	public Person7(int a) {
		age = a;                  //Ϊage���Ը�ֵ
	}
	// ���� speak() ����
	public void speak() {
		System.out.println("�ҽ���" + age + "����!");
	}
}
public class Example09 {
	public static void main(String[] args) {
		Person7 p = new Person7(18); // ʵ����Person����
		p.speak();
	}
}


