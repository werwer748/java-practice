package sec05.chap01.ex01;

public class Button {

    char print;
    int space;
    String mode;

    Button (char print, int space, String mode) {
        this.print = print;
        this.space = space;
        this.mode = mode;
    }

    void place () {
        System.out.printf(
                "표시: %c, 공간: %s, 모드: %s%n",
                print,space, mode
        );
    }
}
//? 객체 object / 인스턴스 instance : 속성(프로퍼티)들과 기능(메소드)들의 묶음
//? 자바에서는 객체와 인스턴스를 같은 것으로 이해해도 됨.
//? 인스턴스는 클래스에서 정의한 방식으로 양산 됨.
