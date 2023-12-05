package sec05.chap03.ex03;

public class Button {
    static String mode = "LIGHT";
    static void switchMode () {
        mode = mode.equals("LIGHT") ? "DARK" : "LIGHT";
    } // 고정되어야 하는 값을 바꾸는 경우 이런식으로 같은 메모리를 참조하게 해서 사용하는 것도 좋은 방법이다.

    char print;
    int space;

    Button (char print, int space) {
        this.print = print;
        this.space = space;
    }

    void place () {
        System.out.printf(
                "표시: %c, 공간: %d, 모드: %s%n",
                print, space, mode
        );
    }
}
