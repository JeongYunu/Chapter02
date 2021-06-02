package com.javaex.ex04;

public class SongApp01 {

	public static void main(String[] args) {

		Song01 info01 = new Song01();
		info01.setInfo("좋은날", "아이유", "Real", "이민수", 2010, 3);
		
		Song01 info02 = new Song01();
		info02.setInfo("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, 2);
		
		Song01 info03 = new Song01();
		info03.setInfo("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, 4);
		
		info01.showInfo();
		info02.showInfo(); 
		info03.showInfo();
		
		/*
		Song01 info01 = new Song01();
		info01.setTitle("좋은날");
		info01.setArtist("아이유");
		info01.setAlbum("Real");
		info01.setComposer("이민수");
		info01.setYear(2010);
		info01.setTrack(3);
		
		Song01 info02 = new Song01();
		info02.setTitle("거짓말");
		info02.setArtist("빅뱅");
		info02.setAlbum("Always");
		info02.setComposer("G-DRAGON");
		info02.setYear(2007);
		info02.setTrack(2);
		
		Song info03 = new Song01();
		info03.setTitle("벚꽃엔딩");
		info03.setArtist("버스커버스커");
		info03.setAlbum("버스커버스커1집");
		info03.setComposer("장범준");
		info03.setYear(2012);
		info03.setTrack(4);
		 */
		

	}

}
