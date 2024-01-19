package sec05.chap06.ex01;

public class ShutDownButton extends Button {
    public ShutDownButton () {
        super("ShutDown"); // 💡 부모의 생성자 호출
        /*
        * super가 생성자에서 사용되는 경우 부모의 생성자를 가리킨다.
        * 부모의 print값이 ShutDown인 클래스가 만들어 지는 것이다.
        */
    }

    //  💡 부모의 메소드를 override
    @Override // 물려받을 메소드 이름을 검사해준다. 안써도 에러는 안남
    public void func () {
        System.out.println("프로그램 종료");
    }
}
