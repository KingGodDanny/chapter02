package com.javaex.ex08;

public class TV {

	//필드--------------------------------------------
	
	private int channel;
	private int volume;
	private boolean power;
	
	
	//생성자------------------------------------------
	
	public TV() { //디폴트 생성자
		
	}
	
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	

	//메소드 게터  (세터X)------------------------------
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	
	
	//메소드 일반---------------------------------------
	
	public void power(boolean on) {
		if(on==true) {
			this.power = true;
		} else  {
			this.power = false; 
		}
	}
		
	
	public void channel(int channel) {
		if(channel<1) {
			 this.channel = 1;
		} else if(channel>255) {
			this.channel = 255;
		}
	}
			
	
	public void channel(boolean up) {
		if(up == true) {
			this.channel++;
		} else if(up == false) {
			this.channel--;
		}
	}
				

	public void volume(int volume) {
		if(volume>100) {
			this.volume = 100;
		}
		
	}

	
	public void volume(boolean up) {
		if(up==true) {
			this.volume++;
		} else if(up == false) {
			this.volume--;
		}
	}
	

	public void status() {
		if(power==true) {
			System.out.println("전원이 켜졌습니다.");
			System.out.println("지금 시청채널중인 채널은 "+ channel + ", 볼륨은 "+ volume + "입니다.");
			
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
		System.out.println("");
	}
	
	
	

}