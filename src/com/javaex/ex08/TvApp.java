package com.javaex.ex08;

public class TvApp {

	public static void main(String[] args) {
		Tv tv = new Tv(-10, -10, true);
		tv.status();
		
		tv.power(true);
		tv.volume(-10);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(-10);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
		
		System.out.println(tv.getChannel());

	}

}
