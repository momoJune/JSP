package kr.green.exam;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
정수 제곱근 판별
문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 
판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.

입출력 예
n		return
121		144
3		-1

입출력 예 설명
입출력 예#1
121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.

입출력 예#2
3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
*/
public class Exam04 {

	public long solution(long n) {
		// n의 루트값을 구한값과 루트값의 소수 이하를 버림값이 같다면 소수 이하가 없는 수이다. 
		// 즉, 제곱수이다. 제곱수이면 +1한 값의 제곱을 리턴하고 제곱수가 아니면 -1을 리턴한다.
		return Math.sqrt(n)==(int)Math.sqrt(n) ?(long) Math.pow((int)Math.sqrt(n)+1, 2) : -1;
	}

	@Test
	public void test() {
		assertEquals(new Exam04().solution(121), 144);
		assertEquals(new Exam04().solution(3), -1);
	}
}
