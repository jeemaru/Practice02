package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("키와 몸무게를 입력해주세요");
	System.out.print("키: ");
	int heg = sc.nextInt(); 
	System.out.println("몸무게: ");
	int wig = sc.nextInt(); 
	
	long kg = (heg-100)*9/10;
	
	if(kg>wig) {
		System.out.println("저체중 입니다.");
		System.out.println("표준체중:"+kg);
	}else if(kg==wig) {
		System.out.println("표준체중 입니다.");
		System.out.println("표준체중:"+kg);
	}else if(kg<wig) {
		System.out.println("과체중 입니다.");
		System.out.println("표준체중:"+kg);
	}
	
	
	sc.close();
	
	}
}
