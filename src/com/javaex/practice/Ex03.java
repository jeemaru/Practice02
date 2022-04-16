package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt(); //<-- 앞에 값이 없음 int나 long
		
		//내부 수식어에는 \\ \\ 이런식으로 역슬레시가 2개 들어가야함 그리고 \"부호가 두개..!
		if (age>20) {
			System.out.println("\"1번그룹\""); 
		}else {
			System.out.println("\\'2번그룹'\\");
		}
		System.out.println("입니다.");
		
		
		sc.close();		
	}

}
