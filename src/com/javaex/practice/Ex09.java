package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자1: ");
		int no1 = sc.nextInt();
		System.out.print("두번쨰 숫자2: ");
		int no2 = sc.nextInt(); 

		int d = no1%no2;
		int b = no2%no1;
		
		if(no1<no2) {
			if(b==0) {
				System.out.print(no1+" 는(은)"+no2+" 의 약수입니다");
			}else {
				System.out.print(no1+" 는(은)"+no2+" 의 약수가아닙니다");
			}
		}else {
			if(d==0) {
				System.out.print(no2+" 는(은)"+no1+" 의 약수입니다");
			}else {
				System.out.print(no2+" 는(은)"+no1+" 의 약수가아닙니다");
			}
			
		}

		sc.close();
	}

}
