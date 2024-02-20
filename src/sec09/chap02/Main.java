package sec09.chap02;

import sec07.chap03.ex06.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.*;

/**
 * java.util.function 패키지
 *  - 자주 사용하는 인터페이스가 java.util.function 패키지에 제공 됨.
 */
public class Main {
    public static void main(String[] args) {
        // Runnable run 메소드를 통해 무언가를 실행한다.
        Runnable dogButtonFunc = () -> System.out.println("멍멍");
        Runnable catButtonFunc = () -> System.out.println("야옹");
        Runnable cowButtonFunc = () -> System.out.println("음메");

        dogButtonFunc.run();
        catButtonFunc.run();
        cowButtonFunc.run();

        System.out.println("\n- - - - -\n");

        Button dogButton = new Button("강아지");
        dogButton.setOnClickListener(dogButtonFunc);

        Button catButton = new Button("고양이");
        catButton.setOnClickListener(() -> {
            System.out.println("- - - - -");
            System.out.println(catButton.getText() + " 울음소리: 야옹야옹");
            System.out.println("- - - - -");
        });

        dogButton.onClick();
        catButton.onClick();

        // Supplier get 메소드를 통해 값을 반환해 준다.
        Supplier<String> appName = () -> "얄코오피스";
        Supplier<Double> rand0to10 = () -> Math.random() * 10;
        Supplier<Boolean> randTF = () -> Math.random() > 0.5;

        String supp1 = appName.get();
        Double supp2 = rand0to10.get();
        Boolean Supp3 = randTF.get();

        System.out.println("\n- - - - -\n");

        // Consumer: 인자를 받아서 무언갈 반환하지는 않는 작업을 한다.
        Consumer<Integer> sayOddEven = i -> System.out.printf(
                "%d은 %c수입니다. %n", i, "짝홀".charAt(i % 2)
        );

        Consumer<Button> clickButton = b -> b.onClick();

        BiConsumer<Button, Integer> clickButtonNTimes = (b, n) -> {
            for (int i = 0; i < n; i++) {
                 b.onClick();
            }
        };

        sayOddEven.accept(3);
        sayOddEven.accept(4);
        clickButton.accept(catButton);
        clickButtonNTimes.accept(dogButton, 5);

        System.out.println("\n- - - - -\n");

        // Function: apply 메소드를 통해 인자를 받아 작업을 처리 후 리턴값 반환
        Function<Integer, Boolean> isOdd = i -> i % 2 == 1;
        Function<String, Button> getButton = s -> new Button(s);

        BiFunction<Unit, Horse, Integer> getfullHP = (u, h) -> {
            h.setRider(u);
            return u.hp;
        };

        BiFunction<String, Runnable, Button> getButtonWFunc = (s, r) -> {
            Button b = new Button(s);
            b.setOnClickListener(r);
            return b;
        };

        Boolean isOdd3 = isOdd.apply(3);
        Boolean isOdd4 = isOdd.apply(4);

        Button goatButton = getButton.apply("염소");

        Integer unitFullHP = getfullHP.apply(
                new MagicKnight(Side.RED),
                new Horse(80)
        );

        getButtonWFunc
                .apply("오리", () -> System.out.println("꽥꽥"))
                .onClick();

        // Predicate: 인자를 받아서 boolean을 반환한다.
        Predicate<Integer> isOddTester = i -> i % 2 == 1;
        Predicate<String> isAllLowerCase = s -> s.equals(s.toLowerCase());

        BiPredicate<Character, Integer> areSameCharNum = (c, i) -> (int) c == i;
        BiPredicate<Unit, Unit> areSameSide = (u1, u2) -> u1.getSide() == u2.getSide();

        boolean isOddT3 = isOddTester.test(3);
        boolean isOddT4 = isOddTester.test(4);
        boolean isAL1 = isAllLowerCase.test("Hello");
        boolean isAL2 = isAllLowerCase.test("world");

        boolean areSameCN1 = areSameCharNum.test('A', 64);
        boolean areSameCN2 = areSameCharNum.test('A', 65);

        boolean areSameSide1 = areSameSide.test(
                new Knight(Side.RED), new Knight(Side.BLUE)
        );
        boolean areSameSide2 = areSameSide.test(
                new Swordman(Side.BLUE), new MagicKnight(Side.BLUE)
        );

        // UnaryOperator: 한가지 자료형의 인자를 받아서 그 자료형의 값을 리턴하는 것
        UnaryOperator<Integer> square = i -> i * i;
        UnaryOperator<Swordman> respawn = s -> {
            if (s instanceof MagicKnight) return new MagicKnight(s.getSide());
            if (s instanceof Knight) return new Knight(s.getSide());
            return new Swordman(s.getSide());
        };

        Integer sqared = square.apply(3);
        Swordman respawned1 = respawn.apply(new Knight(Side.BLUE));
        Swordman respawned2 = respawn.apply(new MagicKnight(Side.RED));

        BinaryOperator<Double> addTwo = (i, j) -> i + j;
        BinaryOperator<Swordman> getWinner = (s1, s2) -> {
            while (s1.hp > 0 && s2.hp > 0) {
                s1.defaultAttack(s2);
                s2.defaultAttack(s1);
                if (s1 instanceof MagicKnight) {
                    ((MagicKnight) s1).lighteningAttack(new Swordman[] { s2 });
                }
                if (s2 instanceof MagicKnight) {
                    ((MagicKnight) s2).lighteningAttack(new Swordman[] { s1 });
                }
            }

            if (s1.hp > 0) return s1;
            if (s2.hp > 0) return s2;
            return null;
        };

//    var added = addTwo.apply(12.34, 23.45);
        Double added = addTwo.apply(12.34, 23.45);

        Swordman winner1 = getWinner.apply(new Swordman(Side.RED), new Knight(Side.BLUE));
        Swordman winner2 = getWinner.apply(new MagicKnight(Side.RED), new Knight(Side.BLUE));
        Swordman winner3 = getWinner.apply(new Swordman(Side.RED), new MagicKnight(Side.BLUE));
        Swordman winner4 = getWinner.apply(new MagicKnight(Side.RED), new MagicKnight(Side.BLUE));

        System.out.println("\n- - - - -\n");

        // 💡 Iterable 인터페이스의  forEach 메소드
        // - 곧 배울 스트림의 forEach 와는 다름 (기능은 같음)
        // - Consumer를 인자로 받아 실행
        // - 이터레이터를 쓸 수 있는 클래스에서 사용 가능

        new ArrayList<>(
                Arrays.asList("하나", "둘", "셋", "넷", "댜섯")
        ).forEach(s -> System.out.println(s));

        System.out.println("\n- - - - -\n");

        HashMap<String, Character> subjectGradeHM = new HashMap<>();
        subjectGradeHM.put("English", 'B');
        subjectGradeHM.put("Math", 'C');
        subjectGradeHM.put("Programming", 'A');

        //  💡 BiConsumer를 받음
        subjectGradeHM.forEach(
                (s, g) -> System.out.println(
                        "%s : %c".formatted(s, g)
                )
        );
    }
}
