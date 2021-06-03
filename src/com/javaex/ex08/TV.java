package com.javaex.ex08;

public class TV {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV() {
		
	}
	
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}


	//메소드 게터
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	//메소드 일반
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		if(channel>0 && channel<256) {
			status();
		} 
	}
	
	public void channel(boolean up) {
		if(up) {
		
		}
		
	}
	
	public void volume() {
		if(volume>100) {
		this.volume=100;
		}
		
	}
	
	public void volume(boolean up) {
		
	}
	
	
	public void status() {
		
			System.out.println("채널: "+ channel + ", 볼륨: "+ volume + power);
			
		} 
		
	
	
	
}
