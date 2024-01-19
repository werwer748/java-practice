package sec05.chap06.ex01;

/*
* 다형성 (Polymorphism)
* 부모 / 자식 관계는 범주의 포함 관계
*/

public class Main {
    public static void main(String[] args) {
        //  💡 가능 - 자식 클래스는 부모 클래스에 속함
//        Button button1 = new Button("Enter");
//        Button button2 = new ShutDownButton();
//        Button button3 = new ToggleButton("CapsLock", true);
//
//        //! 불가 자식 => 부모, 형제 => 형제 간의 관계의 클래스끼리는 서로 담을 수가 없음
////        ShutDownButton button4 = new Button("Enter");
////        ToggleButton button5 = new ShutDownButton();
//
//        //  ⭐️ 편의 : 모두 Button이란 범주로 묶어 배열 등에서 사용 가능
//        Button[] buttons = {
//                new Button("Space"),
//                new ToggleButton("NumLock", false),
//                new ShutDownButton()
//        };
//
//        for (Button button : buttons) {
//            //  ⭐️ 모든 Button들은 func 메소드를 가지므로
//            button.func();
//        }

        /*
        * instanceof 연산자
        * 뒤에 오는 클래스의 자료형에 속하는(족보상 같거나 아래인) 인스턴스인지 확인
        *   ㄴ 이 후 인터페이스에 대해서도 사용 가능
        * 상속관계가 아닌 클래스끼리는 컴파일 오류
        */
        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        // true
        boolean typeCheck1 = button instanceof Button;
        boolean typeCheck2 = toggleButton instanceof Button;
        boolean typeCheck3 = shutDownButton instanceof Button;

        // false
        boolean typeCheck4 = button instanceof ShutDownButton;
        boolean typeCheck5 = button instanceof ToggleButton;

        // 컴파일 에러 - 서로 상속하는 관계가 아니기 때문에...
//        boolean typeCheck6 = toggleButton instanceof ShutDownButton;
//        boolean typeCheck7 = shutDownButton instanceof ToggleButton;

        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton(),
        };

        for (Button btn: buttons) {
            if (btn instanceof ShutDownButton) continue;
            btn.func();
        }
    }
}

