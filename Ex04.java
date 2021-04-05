package week03.day1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] scores = new int[3];
		// 배열입력
		 input(scores);
		 // 배열출력
		 print(scores);
		}
	//배열 입력
	public static void input( int[] s) {
	Scanner sc = new Scanner(System.in);
	for(int i=0; i< s.length; i++) {
		s[i] = sc.nextInt();
		}
	}
	//배열 출력
	public static void print(int[] scores) {
	
		
		for(int i=0; i<scores.length; i++) {
			//int score = scores[i];
			//System.out.print(score)
			System.out.println(scores[i]);
		}
		// 향상된 for문
		for(int score : scores) {
		System.out.println(score);
	}
	
}
}
