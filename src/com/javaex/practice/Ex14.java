package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		long mo = sc.nextLong();

		double mo1 = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(mo-8000);
		double mo2 = 1000*0.09 + 4000*0.18 + 0.27*(mo-4000);
		double mo3 = 1000*0.09 + 0.18*(mo-1000);
		double mo4 = 1000*0.09;
		
		if(mo>8000) {
			System.out.print("소득세는 "+mo1+" 입니다.");
		}else if(mo>4000) {
			System.out.print("소득세는 "+mo2+" 입니다.");
		}else if(mo>1000) {
			System.out.print("소득세는 "+mo3+" 입니다.");
		}else if(mo<=1000) {
			System.out.print("소득세는 "+mo4+" 입니다.");
		}
			
		
		
		sc.close();
	}

}
