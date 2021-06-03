package com.javaex.ex08;

public class TVApp {

	public static void main(String[] args) {
		
		TV tv = new TV(7, 120, false);
		tv.status();
		
		tv.power(true);
		tv.volume(120);    //100으로 유지
		tv.status();
		
        tv.volume(false);
        tv.status();
        
        tv.channel(0);
        tv.status();		          
        
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        tv.status();

        tv.power( false );
        tv.status();      		
		
	}

}

/*생성자대신 메소드를 이용하는 이유인것같다. 
생성자로 한번에 출력할수도 있지만 출력값을 수정해야하는 경우엔
메소드를 사용할수있는 장점인것같다. 
*/