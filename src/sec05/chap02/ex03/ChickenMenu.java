package sec05.chap02.ex03;

public class ChickenMenu {
    String name;
    int price;
    String cook = "fry";

    // * 클래스는 둘 이상의 생성자를 가질 수 있음
    ChickenMenu (String name, int price) {
        this.name = name;
        this.price = price;
    }

    //? 오버로딩 (인자 하나 더 받음)
    ChickenMenu (String name, int price, String cook) {
        this.name = name;
        this.price = price;
        this.cook = cook;
    }
}
