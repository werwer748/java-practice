package sec09.chap03;

import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * 메소드 참조(Method reference)
 *  - 람다식이 어떤 메소드 하나만 호출할 때 코드를 간편화
 *      ㄴ 즉 해당 람다식과 메소드의 의미가 사실상 같을 때
 *  - 해당 메소드가 인터페이스와 인자, 리턴값 구성이 동일할 때
 */
public class Main {
    public static void main(String[] args) {
        // 클래스의 클래스 메소드에 인자 적용하여 실행
        Function<Integer, String> intToStrLD = (i) -> String.valueOf(i);
        Function<Integer, String> intToStrMR = String::valueOf;
        String intToStr = intToStrMR.apply(123);

        //  인자로 받은 인스턴스의 메소드 실행
        UnaryOperator<String> toLCaseLD = s -> s.toLowerCase();
        UnaryOperator<String> toLCaseMR = String::toLowerCase;
        String toLCase = toLCaseMR.apply("HELLO");

        Function<String, Button> strToButtonLD = s -> new Button(s);
        Function<String, Button> strToButtonMR = Button::new;
        Button button1 = strToButtonMR.apply("Dog");

        BiFunction<String, String, Button> twoStrToButtonLD = (s1, s2) -> new Button(s1, s2);
        BiFunction<String, String, Button> twoStrToButtonMR = Button::new;
        Button button2 = twoStrToButtonMR.apply("고양이", "야옹");
        button2.onClick();

        System.out.println("\n- - - - -\n");

        //  현존하는 인스턴스의 메소드 실행
        Runnable catCryLD = () -> button2.onClick();
        Runnable catCryMR = button2::onClick;
        catCryMR.run();

        //  💡 임의의 인스턴스의 메소드 참조
        TreeSet<String> treeSetLD = new TreeSet<>((s1, s2) -> s1.compareTo(s2));
        TreeSet<String> treeSetMD = new TreeSet<>(String::compareTo);
    }
}
