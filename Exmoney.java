package week03.day1;

import java.util.Scanner;

public class Exmoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int cnt[] = new int[8];
		String name;
		int expense;
		int balance;
		int price_unit = 50000;
	
		Scanner sc = new Scanner(System.in);
		while(true) {
			name = sc.next();
			expense = sc.nextInt();
			
			if( name.equals("STOP")) break;
			
			balance = expense;
			int sw=0;
			for(int i=0; i<cnt.length;i++) {
			
				cnt[i] = balance / price_unit;
				balance = balance % price_unit;
				if(sw==0) {
					price_unit = price_unit /5;
					sw=1;
					
				}else if(sw==1){
					price_unit = price_unit /2;
					sw=0;
				}
			} //화폐매수 출력
			for(int i=0; i<cnt.length; i++) {
				System.out.printf("%6d", cnt[i]);
			}
	}
	
		
		
	}

}
