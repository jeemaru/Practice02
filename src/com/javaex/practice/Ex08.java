package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int no1 = sc.nextInt();
		System.out.print("숫자2: ");
		int no2 = sc.nextInt(); 
		System.out.print("숫자3: ");
		int no3 = sc.nextInt(); 
		
		
		if (no1<no2) {
			if(no1<no3) {
				System.out.print("가장 작은수는: "+no1);
			}else {
				System.out.print("가장 작은수는: "+no3);
			}
		 	
		}else {
			if(no2<no3) {
				System.out.print("가장 작은수는: "+no2);
			}else {
				System.out.print("가장 작은수는: "+no3);
			}
		}
		
		sc.close();

	}

}
