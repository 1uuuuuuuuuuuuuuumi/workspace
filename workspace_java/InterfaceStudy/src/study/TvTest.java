package study;

//국제 tv 연합 기구 (방금지어냄)
public class TvTest {
  public static void main(String[] args) {
    Tv tv = new LgTv();
    tv.turnOn();
    tv.volumeDown();
    tv.volumeUp();
    tv.turnOff();
  }
}
