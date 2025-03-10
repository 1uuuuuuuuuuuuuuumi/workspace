package practice;

public class Song_T_test {
  public static void main(String[] args) {
    Song_T song = new Song_T();
    String[] composer = {"김자바", "이자바", "박자바"};
    song.initSong("java", "김자바", "1집", 2025, composer);
    song.printSong();
  }
}
