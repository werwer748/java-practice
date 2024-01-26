package sec07.chap01.ex01;

/*
* Object
* 모든 클래스의 조상
* 필드없이 메소드들만 갖고 있음
*   - 모든 클래스들에 상속 됨
*   - 필요에 따라 오버라이드하여 사용
*
* Object 인스턴스 클래스 살펴보기
*   - @IntrinsicCandidate : HotSpot VM (현재 대다수 JVM) 에 의한 최적화
*       : 작성된 코드를 보다 효율적인 내부적 동작으로 덮어씀
*   - native : C, C++ 등 다른 언어로 작성된 코드를 호출하여 성능 향상
*       : Java Natice Interface 사용
*/

public class Button {
    /*
    * toString 메소드
    *   - 기본적으로는 클래스명과 해시값을 반환
    *   - println 메소드로 객체 출력시 기본적으로 이 메소드의 결과값 출력
    *   - intelliJ 코드 생성 메뉴에서 선택
    */

    public enum Mode {
        LIGHT("라이트"), DARK("다크");
        Mode(String indicator) {
            this.indicator = indicator;
        }
        String indicator;
    }

    private String name;
    private Mode mode;
    private int spaces;

    public Button(String name, Mode mode, int spaces) {
        this.name = name;
        this.mode = mode;
        this.spaces = spaces;
    }

    //  ⭐️ 아래를 주석해제하고 다시 실행해 볼 것
    @Override
    public String toString() {
          return "%s %s버튼 (%d칸 차지)"
                  .formatted(mode.indicator, name, spaces);
    }
}
