package week03.day1;

public class Ex01 {

	public static int genTenTotal() {
		int result=0;
		
		for(int i=1 ; i<=10; i++) {
			result += i;// result = result +i
			
			
		}
		
		return result;
		
		
	}
	
	public static boolean isAdult(int age) {
		boolean result;
		
		if (age>=20) {
				result = true;
		}else {
				result = false;
		}
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~10���� ���� �����ִ� �޼���
		int result = genTenTotal();
		System.out.println("�հ�=" + result);
		
		boolean result2 = isAdult(17);
		System.out.println(result2);
		
		System.out.println(isAdult(21));
	}

}
