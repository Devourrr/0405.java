package week03.day1;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a;
		// Score s; �ڹٿ����� �Ұ����ϴ� (�迭, class => �����޸�)
		//�ڹ� �迭���� �����޸� ��� ����
		//Score s;
		
		
		Score s = new Score(); //s�� ������ ����, ��������, �޸�Ȯ��
		s.name = "ȫ�浿"; 	//Score�� �ڷ��� �����ͱ���
		s.kor = 90;
		s.eng = 80;
		s.math = 100;
		
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
		
		disp(s);
		
	}
	public static void disp (Score s) {
		System.out.println( s.name);
		System.out.println( s.kor);
		System.out.println( s.eng);
		System.out.println( s.math);
	}

}
