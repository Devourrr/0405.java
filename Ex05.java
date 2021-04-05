package week03.day1;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생성적정보, 그릇 4개
		String name = "홍길동";
		int kor=90;
		int eng=80;
		int math=100;
		
		disp(name, kor, eng, math);
	}
	
	public static void disp (String name, int kor, int eng, int math) {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
	}

}
