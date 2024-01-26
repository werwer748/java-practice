package sec07.chap01.ex02;

/*
* equals 메소드
*   - 기본적으로는 == 과 같이 레퍼런스 비교
*   - 인스턴스 내용을 비교하려면 클래스마다 오버라이드 해야 함
*/

public class Click {
    int x;
    int y;
    int timestamp;

    public Click(int x, int y, int timestamp) {
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }

    //  ⭐️ 아래를 주석해제하고 다시 실행해 볼 것
      @Override
      public boolean equals(Object obj) { // cm + n으로 똑같이 만들 수 있음
          if (!(obj instanceof Click)) return false;
          return this.x == ((Click) obj).x && this.y == ((Click) obj).y;
      }
}
