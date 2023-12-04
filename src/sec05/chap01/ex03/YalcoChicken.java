package sec05.chap01.ex03;

public class YalcoChicken {
    int no;
    String name;

    //  ⭐ 생성자(constructor) : 인스턴스를 만드는 메소드
    //  ⭐ this : 생성될 인스턴스를 가리킴

    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
        /*
        * this : 만들어질 인스턴스를 가리킴
        * 메소드 내에서 같은 이름의 변수나 인자가 없다면 식별자는 this 의 필드를 가리킴
        * 같은 이름의 변수나 인자가 있다면 덮어 씌워짐
        *   ㄴ 필드에는 this 를 붙여 구분
        */
    }

    String intro () {
//          String name = "몽고반"; // 주석해제 시 name 대체
//        YalcoChicken thisShop = this;
        return "안녕하세요, %d호 %s점입니다." // 🔴
                .formatted(no, name);
    }
}
