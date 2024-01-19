package sec05.chap04.ex01;

/*
* 1에서 이 클래스를 임포트 해왔던 코드
package sec05.chap04.ex02;

import sec05.chap04.ex01.SmartPhone;

public class Main {
    public static void main(String[] args) {
        //  ⭐️ 다른 패키지에서 사용하면 상단에 임포트되어야 함 (IDE 안내)
        SmartPhone smartPhone = new SmartPhone();

        // import 해온 경우 원본에 public 설정이 있어야 사용이 가능하다.
        String pb = smartPhone.powerButton; // ⚠️ 불가
        String ss = smartPhone.sdCardSlot;
    }
}
*/

public class SmartPhone {
    //? 다른 Main에서 임포트해가는 경우 public이 아니라 사용이 안됨.
    String powerButton = "OnOff";


    public String sdCardSlot = "SD Card";

    // * 외부에서 접근하지 못하게 막음
    private String cpu = "Yalcom";
}
