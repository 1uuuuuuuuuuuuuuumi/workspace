package practice;

public class Test_13 {
  String title;
  String artist;
  String album;
  int year;
  String composer;
  String composer1;
  String composer2;

  public void setAllInfo(String title1, String artist1, String album1, int year1, String composer10, String composer11, String composer21){
    title = title1;
    artist = artist1;
    album = album1;
    year = year1;
    composer = composer10;
    composer1 = composer11;
    composer2 = composer21;
  }

  public void printAllInfo(){
    System.out.println("TITLE : " + title);
    System.out.println("ARTIST : " + artist);
    System.out.println("ALBUM : " + album);
    System.out.println("YEAR : " + year);
    System.out.println("COMPOSER1 : " + composer);
    System.out.println("COMPOSER2 : " + composer1);
    System.out.println("COMPOSER3 : " + composer2);
  }
}
