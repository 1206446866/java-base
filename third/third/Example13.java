package third;
class Person4 {
	public static void say() { // ���徲̬����
		System.out.println("Hello!");
	}
}
public class Example13 {
	public static void main(String[] args) {
		// ������.�������ķ�ʽ���þ�̬����
		Person4.say();
		// ʵ��������
		Person4 person = new Person4();
		// ��ʵ��������.�������ķ�ʽ�����þ�̬����
		person.say();
	}
}


