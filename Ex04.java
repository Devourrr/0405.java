package week03.day1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] scores = new int[3];
		// �迭�Է�
		 input(scores);
		 // �迭���
		 print(scores);
		}
	//�迭 �Է�
	public static void input( int[] s) {
	Scanner sc = new Scanner(System.in);
	for(int i=0; i< s.length; i++) {
		s[i] = sc.nextInt();
		}
	}
	//�迭 ���
	public static void print(int[] scores) {
	
		
		for(int i=0; i<scores.length; i++) {
			//int score = scores[i];
			//System.out.print(score)
			System.out.println(scores[i]);
		}
		// ���� for��
		for(int score : scores) {
		System.out.println(score);
	}
	
}
}
