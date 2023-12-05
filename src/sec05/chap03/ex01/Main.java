package sec05.chap03.ex01;

public class Main {
    public static void main(String[] args) {
        //  💡 클래스 필드와 메소드는(static으로 선언) 인스턴스를 생성하지 않고 사용
        String ycBrand = YalcoChicken.brand;
        String ycContact = YalcoChicken.contact();

        // ⚠️ 인스턴스 메소드는 불가
        //  String ycName = YalcoChicken.name;
        //  String ycIntro = YalcoChicken.intro();

        YalcoChicken store1 = new YalcoChicken(3, "판교");
        String st1Intro = store1.intro();

        //  인스턴스에서는 클래스의 필드와 메소드 사용 가능
        //  ⚠️ 편의상 기능일 뿐, 권장하지 않음 (혼란 초래. IDE에서 자동완성 안 됨 주목)
//        String st1Brand = store1.brand; // 안티패턴
        String st1Brand = YalcoChicken.brand; // * 옳은 방법
//        String st1Contact = store1.contact(); // 안티패턴
        String st1Contact = YalcoChicken.contact();
    }
}
