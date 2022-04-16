package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쨰 숫자: ");
		int no1 = sc.nextInt();
		System.out.print("두번쨰 숫자: ");
		int no2 = sc.nextInt(); 
		
		int n011 = no1/no2;
		int n021 = no2/no1;

		if (no1>no2) {
			System.out.println("몫: "+n011);
			System.out.println("나머지: "+no1%no2);
		}else if (no2>no1) {
			System.out.print("몫: "+n021);
			System.out.println("나머지: "+no2%no1);
		}else if (no1>no2) {
		}
		
		
		
		sc.close();

	}

}
