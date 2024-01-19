package sec05.chap05.ex01;

public class YalcoChicken {
    //? protected는 자식 클래스에서는 접근이 가능 하다.
    protected int no;
    protected String name;

    public YalcoChicken (int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void takeHallOrder () {
        System.out.printf("%d호 %s점 홀 주문 받음%n", no, name);
    }
}
