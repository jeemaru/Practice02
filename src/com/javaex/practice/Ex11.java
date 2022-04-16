package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String eng = sc.nextLine();
		
		switch (eng) {
			case "a" : 
				System.out.print("모읍입니다.");
				break;
			case "e" : 
				System.out.print("모읍입니다.");
				break;
			case "i" : 
				System.out.print("모읍입니다.");
				break;
			case "o" : 
				System.out.print("모읍입니다.");
				break;
			case "u" : 
				System.out.print("모읍입니다.");
				break;
			default: 
				System.out.print("자음입니다.");
				break;	
		}
		
		

		sc.close();

	}

}
