package sec03.chap04;

public class Ex01 {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = false;

        // 부정연산자 => ! : boolean의 값을 반전
        boolean bool3 = !true;
        boolean bool4 = !false;

        boolean bool5 = !!bool3;
        boolean bool6 = !!!bool3;

        // intelliJ에서 비교 연산자에 커서를 가져다 대면 단위별로 true, false가 표시됨
        boolean bool7 = !(1 > 2);
        boolean bool8 = !((5 / 2) == 2.5);
        boolean bool9 = !((3f + 4.0 == 7) != ('A' < 'B'));
    }
}
