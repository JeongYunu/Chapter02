package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		
		//디폴트생성자
		Song info01 = new Song();
		info01.setTitle("좋은날");
		info01.setArtist("아이유");
		info01.setAlbum("Real");
		info01.setComposer("이민수");
		info01.setYear(2010);
		info01.setTrack(3);
		
		info01.showInfo();
		
		Song info02 = new Song("거짓말", "BIGBANG", "Always", "G-DRANGON");
		info02.setYear(2007);
		info02.setTrack(2);
		
		info02.showInfo();
		
		Song info03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, 4);
		
		info03.showInfo();
		
		System.out.println("=========");
		System.out.println(info01.getTitle());
	}

}
