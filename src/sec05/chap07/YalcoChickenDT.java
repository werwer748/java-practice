package sec05.chap07;

//? 클래스에 final이 붙는다는 것은 자식을 가질 수 없다는 것
public final class YalcoChickenDT extends YalcoChicken {
    public YalcoChickenDT(int no, String name) {
        super(no, name);
    }

    //  ⚠️ 불가
//    public void fryChicken () {
//        //? 상속받은 메소드에서는 오버라이드 할 수 없다.
//        System.out.println("염지, 반죽입히기, 미원, 튀김");
//    }

    // 생성자 추가할 것.
}
