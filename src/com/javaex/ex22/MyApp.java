package com.javaex.ex22;

import java.io.IOException;

public class MyApp {

	public static void main(String[] args) {
		
		FileReader fr = new FileReader();  //디폴트 생성자 부른것
		
		//정상적으로 파일이 있는경우 예시
		fr.Read("C:/school.text");    //정상적인 경우 예제!
		
		
		//파일이 없을때
		fr.Read2("C:/school.text");
		
		//예외발생처리
		try {
			fr.Read3("C:/school.text");
		} catch (IOException e) {
			System.out.println("no file");
		}
		
	}

}
