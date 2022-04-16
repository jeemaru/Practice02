package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번:");
		int no = sc.nextInt();
		
		int dc1 = no%3;
		
		if (dc1==0){
				System.out.print("A팀입니다.");
		}
		if (dc1==1){
			System.out.print("B팀입니다.");
		}
		if (dc1==2){
			System.out.print("C팀입니다.");
		}else if(0>dc1){
			System.out.print("잘못입력하셨습니다.");		
		}
		
		
		sc. close();
		}

}
