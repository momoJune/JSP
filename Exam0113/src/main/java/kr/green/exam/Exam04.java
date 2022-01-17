package kr.green.exam;

import java.util.Scanner;

/*
직사각형 별찍기
문제 설명
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 
형태를 출력해보세요.

제한 조건
n과 m은 각각 1000 이하인 자연수입니다.
*/
public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=0;i<m;i++) { // 줄수
			for(int j=0;j<n;j++) { // 줄당 개수
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		sc.close();
    }
}