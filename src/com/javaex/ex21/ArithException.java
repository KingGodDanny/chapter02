package com.javaex.ex21;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		num = sc.nextInt();
		
		
		 
		//0을 넣었을때 오류가난다 -->>java.lang.ArithmeticException: / by zero
		//예외상황이 발생한것!!!
		
		try { //오류가 발생하냐를 감시하는 영역임 --최소한으로 코딩!
			result = 100/num;  
			System.out.println(result);
			//try가 정상인경우 ↑↑↑↑↑↑↑↑출력하느것
		} catch(ArithmeticException error) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally { //정상이든 아니든 무조건 오는영역!
			System.out.println("finally영역");
		}
		
		
		
		
		
		sc.close();

	}

}
