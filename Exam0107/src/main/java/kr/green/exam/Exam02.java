package kr.green.exam;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
문자열 다루기 기본
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, 
solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 
"1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 	예
s		return
"a234"	false
"1234"	true
*/
public class Exam02 {

	public boolean solution(String s) {
		boolean result = true;
		try {
			if(s.length()!=4 && s.length()!=6) { // 문자열 s의 길이가 4 혹은 6이고
				result = false;
			}
			Integer.parseInt(s); // 숫자로만 구성 : 숫자로 변환 실패는 문자가 들어있다.
		}catch (Exception e) {
			result = false; // 문자있다.
		}
		return result;
	}

	@Test
	public void test() {
		assertFalse(new Exam02().solution("a234"));
		assertTrue(new Exam02().solution("1234"));
	}
}
