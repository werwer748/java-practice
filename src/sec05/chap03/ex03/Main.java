package sec05.chap03.ex03;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button('1', 1);
        Button buttonPlus = new Button('+', 3);
        Button buttonClear = new Button('C', 2);

        Button[] buttons = { button1, buttonPlus, buttonClear };

        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }

        // 연속으로 실행해보자!
        Button.switchMode();

        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }

        // 연속으로 실행해보자!
        Button.switchMode();

        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }
    }
}
