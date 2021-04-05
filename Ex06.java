package week03.day1;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a;
		// Score s; 자바에서는 불가능하다 (배열, class => 동적메모리)
		//자바 배열부터 동적메모리 사용 강제
		//Score s;
		
		
		Score s = new Score(); //s는 참조형 변수, 변수선언, 메모리확보
		s.name = "홍길동"; 	//Score형 자료의 데이터구조
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
