package week03.day1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = new int[5];
		
		//�迭 �Է�
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i< scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		
		//�迭 ���
		for(int score : scores) {
			System.out.println(score);
		}
	}

}
