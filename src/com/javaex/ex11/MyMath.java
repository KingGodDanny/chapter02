package com.javaex.ex11;

public class MyMath {

	//필드---------------------------------------------------------------------------
	private static double PI = 3.14;    
	//스태틱에 올려주기위해 static이 붙음  
	//결국 메소드를 스태틱으로 쓰기위해선 필드값도 스태틱으로 올려주는걸 생각해야함!
	
	
	//생성자-------------------------------------------------------------------------
	
	
	
	
	
	//메소드 게터세터----------------------------------------------------------------
	
	
	
	//메소드 일반   -->메소드 오버로딩(라이딩은 다띄우는것)-------------------------
	
	public static int plus(int a, int b) {
		
		int result = a + b;		// 복잡한 계산식이라고 가정한다.
		
		return result;
	}  
	
	public static double plus(double a, double b ) {
		double result = a + b;
		return result;
	}
	
	public static double plus(double a, int b ) {
		double result = a + b;
		return result;
	}
	
	
	public static double plus(int a, double b ) {
		double result = a + b;
		return result;
	}
	
	public static double circleArea(int radius) {
		double result = radius * radius * PI;
		return result;
		
	}
	
}
