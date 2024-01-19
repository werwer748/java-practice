package sec05.chap05.ex02;

/*
* 메소드 오버라이딩
* 부모가 가진 같은 이름의 메소드를 자식이 다르게 정의
* 오버로딩과 혼동하지 말 것 - 오버로딩은 같은 이름의 메서드를 매개변수 유형과 개수를 다르게하여 다양한 호출에 응답할 수 있게 하는 것.
*/

public class Button {
    private String print;

    public Button(String print) {
        this.print = print;
    }

    public void func () {
        System.out.println(print + " 입력 적용");
    }
}
