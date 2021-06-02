package com.javaex.ex04;

public class Song {
	//필드구간
	
	private String title;
	private String artist;
	private String composer;
	private String album;
	private int year;
	private int track;
	
	
	//메소드 셋터 겟터구간
	
	//-----------타이틀---------------
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	//-------------아티스트---------------------
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	//------------앨범--------------------------
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getAlbum() {
		return album;
	}
	
	//--------------작곡가---------------------------
	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getComposer() {
		return composer;
	}
	
	//-------------연도------------------------
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	//----------------트랙-----------------------
	public void setTrack(int track) {
		this.track = track;
	}
	
	public int getTrack() {
		return track;
	}
	
	
	//메소드 (일반)
	public void showInfo() {
		System.out.println(artist + ", " + title +" ( "+ album + ", " + year + ", " + track+ 
				"번 track" + ", " + composer + "작곡) ");
		
	}
	
}
