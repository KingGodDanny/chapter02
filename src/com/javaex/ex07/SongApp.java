package com.javaex.ex07;

//다른 패키지에서 복사할경우 이자리에 그 패키지가 임포트 되는 경우가있으니
//나무를 보지말고 숲을 보자!!!


public class SongApp {

	public static void main(String[] args) {
		
		Song iU = new Song();
		iU.setArtist("아이유");
		iU.setTitle("좋은날");
		iU.setAlbum("Real");
		iU.setYear(2010);
		iU.setTrack(3);
		iU.setComposer("이민수");
		iU.showInfo();
		
		
		
		Song bigbang = new Song("거말" , 6);
		bigbang.showInfo();
		bigbang.setTitle("거짓말");
		bigbang.showInfo();
		
		
		Song bigbang02 = new Song("거진말",10);
		bigbang02.showInfo();
		
		
		
		Song bigbang03 = new Song("쥐드래곤" , "거진말");
		bigbang03.showInfo();
		
		
		
		Song busker = new Song("벚꽂엔딩", "버스커버스커","장범준", "버스커버스커1집", 2012, 4);
		busker.showInfo();
		
		
	}

}
