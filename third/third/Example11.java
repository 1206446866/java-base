package third;
class Person5 {
	public Person5() {
		System.out.println("�޲εĹ��췽����������...");
	}
	public Person5(int age) {
		this();                    // �����޲εĹ��췽��
		System.out.println("�вεĹ��췽����������...");
	}
}
public class Example11 { 
	public static void main(String[] args) {
		Person5 p = new Person5(18); // ʵ���� Person ����
	}
}


