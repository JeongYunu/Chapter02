package com.javaex.ex08;

public class Tv {
	//필드
	private int channel;
	private int volume;
	private boolean power;

	
	//생성자
	
	public Tv() {
		
	}

	

	
	public Tv(int channel, int volume, boolean power) {
		if(channel >= 255) {
			channel = 255;
		}else if(channel <= 1) {
			channel = 1;
		}
		if(volume >= 100) {
			volume = 100;
		}else if(volume <= 0) {
			volume = 0;
		}

		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	
	
	//메소드
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	
	
	//메소드-일반
	public void power(boolean on) {
		if(on == true) {
			power = true;
		}else {
			power = false;
		}
	}
	
	public void channel(int channel) {
		if(channel >= 255) {
			channel = 255;
		}else if(channel <= 1) {
			channel = 1;
		}
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		if(up == true) {
			if(channel >= 255) {
				channel = 255;
			}else {
				channel++;
			}
		}else if(channel <= 1){
				channel = 1;
			}else {
				channel--;
		}
	}
	
	public void volume(int volume) {
		if(volume >= 100) {
			volume = 100;
		}else if(volume <= 0) {
			volume = 0;
		}
		this.volume = volume;
		
	}
	
	public void volume(boolean up) {
		if(up == true) {
			if(volume >= 100) {
				volume = 100;
			}else {
				volume++;
			}
		}else if(volume <= 0){
				volume = 0;
			}else {
				volume--;
		}
	}
	
	public void status() {
		if(power == true) {
			System.out.println("채널: " + channel + " 소리: " + volume + " 전원: " + "on");
		}else {
			System.out.println("전원: " + "off");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
