package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021033 黃苡珊
 */
public class hw03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		System.out.println("在二進制下有 "+fun(v1)+" 個位元是 1");
		}

	public static int fun(int v1) {
		if (v1==0) {
			return v1;
		} else {
			if (v1%2==1) {
				return fun(v1/2) + 1;
			} else {
				return fun(v1/2);
			}
		}
	}
}