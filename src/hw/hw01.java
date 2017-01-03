package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021033 黃苡珊
 */
public class hw01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		System.out.println(to2(v1));
	}
	public static String to2(int v1) {
		if(v1==0)
		return "";
		return to2((v1-v1%2)/2)+""+v1%2;
		}
}