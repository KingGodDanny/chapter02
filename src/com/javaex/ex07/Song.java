package com.javaex.ex07;

public class Song {

	//필드값------------------------------------------------------
	private String title;          //필드값을 넣어줘야 겟터셋터 불러오기가 가능하다
	private String artist;		   //쉬프트 알트 S
	private String composer;
	private String album;
	private int year;
	private int track;
	
	
	
	//생성자---------------------------------------------------------
	public Song(String title, String artist, String composer, String album, int year, int track) {
		
		this(title, track);
		
		this.composer = composer;
		this.album = album;
		this.year = year;
		this.track = track;
	}   //쉬프트 알트 S 에서 컨스트럭쳐 유징 필드

	public Song () {
		//디폴트 생성자 > 다른 생성자를 생성할경우에 디폴트생성자는 사라지기때문에
		//디폴트 사용자를 사용하려면 이처럼 디폴트생성자를 써줘야한다.
	}
	
	public Song(String title, int track) {
		this.title = title;
		this.track = track;
	}
	
	public Song(int year, int track) {
		this.year = year;
		this.track = track;
	}
	
	public Song(String composer, String album) {
		this.composer = composer;
		this.album = album;
	}
	
//	public Song(String artist, String album) { 
//		this.artist;
//		this.album = album;
//	} //위의 생성자가 오류나는 이유는 위에 같은 순서의 자료형이 있기때문에
	  //이 생성자의 변수명과 상관없이 자료형을 보고 같다고 인지하기때문에
	  //반드시 순서가 다른 자료형을 넣어주던가 하나만 쓰던가 해야한다!!!!!
	
	
	
	//메소드 게터세터--------------------------------------------------
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	
	//메소드 (일반)---------------------------------------------------------------
		public void showInfo() {
			System.out.println(artist + ", " + title +" ( "+ album + ", " + year + ", " + track+ 
					"번 track" + ", " + composer + "작곡) ");
			
		}
	
		
		
		
}
