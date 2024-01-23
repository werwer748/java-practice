package sec06.chap06.ex02;

/*
* 버튼 내부에 enum을 작성해 사용할 수 있다.
*/

public class Button {
    enum Mode { LGIHT, DARK }
    enum Space { SINGLE, DOUBLE, TRIPLE }

    private Mode mode = Mode.LGIHT;
    private Space space = Space.SINGLE;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
}
