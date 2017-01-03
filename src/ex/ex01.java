package ex;

import java.util.Scanner;

/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021033 黃苡珊
 */

public class ex01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int i = scn.nextInt();
		System.out.println(to2(i));
	}
	public static String to2(int i) {
		String str = Integer.toBinaryString(i);
		return str;
	}
}
