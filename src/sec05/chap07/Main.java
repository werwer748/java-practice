package sec05.chap07;

public class Main {
    public static void main(String[] args) {
        String ycCreed = YalcoChicken.CREED;
//        YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ 불가 - 파이널로 선언되서

        final YalcoChicken store1 = new YalcoChicken(3, "판교");

        // ⚠️ 불가 - final로 선언되엇기 때문에
//        store1 = new YalcoChicken(17, "강남");
        //  💡 요소 변경은 가능 - 필드는 바꿀 수 있다.(주소는 바꾸지 못하지만 인테리어는 바꿀 수 있다.)
        store1.name = "선릉";
    }
}
