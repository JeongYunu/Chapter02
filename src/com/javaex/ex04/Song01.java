package com.javaex.ex04;

public class Song01 {

	//필드
	private String title, artist, album, composer;
	private int year, track;
	/*
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	 */
	
	//메소드 
	
	//세터
	public void setInfo(String title, String artist, String album, String composer, int year, int track){
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	/*
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	*/
	
	//겟터
	
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;	
	}
	public int getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}

	
	
	//출력
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
	}
}
