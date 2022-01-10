package kr.green.exam;

import java.util.Arrays;

public class MainApp {
	public static void main(String[] args) {
		String str1 = "abc abc    abc";
		String str2 = "abc abc    abc    ";
		System.out.println(Arrays.toString(str1.split(" ")));
		System.out.println(Arrays.toString(str2.split(" ")));
		System.out.println(Arrays.toString(str2.split(" ",-1)));
	}
}
