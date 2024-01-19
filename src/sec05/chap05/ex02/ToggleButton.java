package sec05.chap05.ex02;

public class ToggleButton extends Button {
    private boolean on;

    public ToggleButton(String print, boolean on) {
        /*
        * 순서가 중요하다.
        * 자식 생성자에서는 꼭 super를 먼저 써야함.
        * 부모의 인스턴스 생성 후 이를 기반으로 자식 인스턴스가 생성
        */
        super(print);
        this.on = on;
    }

    @Override // 물려받을 메소드 이름을 검사해준다. 안써도 에러는 안남
    public void func () {
        super.func(); // 💡 부모에서 정의한 메소드 호출
        /*
        * super가 생성자가 아닌 일반 메서드에서 쓰이게되면
        * 부모를 가르키는 것
        */
        this.on = !this.on;
        System.out.println(
                "대문자입력: " + (this.on ? "ON" : "OFF")
        );
    }
}
