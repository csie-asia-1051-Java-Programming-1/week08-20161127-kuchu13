package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021033 黃苡珊
 */

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();//數字
		int n = scn.nextInt();//N進制

		System.out.println(toN(v1,n));
	}
	public static String toN(int v1,int n) {
		if(v1==0)
		return "";
		return toN((v1-v1%n)/n,n)+""+v1%n;
		}
	}