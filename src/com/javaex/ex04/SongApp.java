package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
		
		Song iU = new Song();
		iU.setArtist("아이유");
		iU.setTitle("좋은날");
		iU.setAlbum("Real");
		iU.setYear(2010);
		iU.setTrack(3);
		iU.setComposer("이민수");
		
		Song bigbang = new Song();
		bigbang.setArtist("BIGBANG");
		bigbang.setTitle("거짓말");
		bigbang.setAlbum("Always");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		bigbang.setComposer("G-DRAGON");
		
		
		Song busker = new Song();
		busker.setArtist("버스커버스커");
		busker.setTitle("벚꽃엔딩");
		busker.setAlbum("버스커버스커1집");
		busker.setYear(2012);
		busker.setTrack(4);
		busker.setComposer("장범준");
		
		iU.showInfo();
		bigbang.showInfo();
		busker.showInfo();
	}

}
