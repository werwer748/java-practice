package sec05.chap08.ex01;

public abstract class YalcoGroup {
    protected static final String CREED = "우리의 %s 얄팍하다.";

    //  💡 클래스 메소드는 abstract 불가
//    abstract static String getCreed ();

    protected final int no;
    protected final String name;

    public YalcoGroup(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String intro() {
        return "%d호 %s점입니다.".formatted(no, name);
    }


    /*
    * abstract 메소드?
    * 추상 클래스에서만 사용 가능
    * 선언만하고 구현하지는 않는다 ({} 구현부가 없음)
    * ⭐ 자식 클래스에서 반드시 구현해야 한다. - 구현하지 않을 시 컴파일 에러!
    * 접근 제어자가 의미가 없다. 어차피 자식 클래스에서 구현하기 때문에 - public을 빼도 에러가 생기지 않음
    */
    public abstract void takeOrder();
}
