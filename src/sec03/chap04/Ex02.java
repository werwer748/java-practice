package sec03.chap04;

/*
* 논리 연산자
* a && b | AND | a와 b가 모두 true일 때만 true를 반환
* a || b | OR  | a와 b 중 하나만 true면 true 반환
*/
public class Ex02 {
    public static void main(String[] args) {
        boolean bool1 = true && true;
        boolean bool2 = true && false;
        boolean bool3 = false && true;
        boolean bool4 = false && false;

        boolean bool5 = true || true;
        boolean bool6 = true || false;
        boolean bool7 = false || true;
        boolean bool8 = false || false;

        int num = 4;

        boolean isPositiveAndOdd = num >= 0 && num % 2 == 1;
        boolean isPositiveOrOdd = num >= 0 || num % 2 == 1;

        boolean isPositiveAndEven = num >= 0 && num % 2 == 0;
        boolean isPositiveOrEven = num >= 0 || num % 2 == 0;

        num = 6;

        //  💡 &&가 ||보다 우선순위 높음
        //? 둘의 결과가 다른데 복잡한 식은 ()를 이용해 명확히 우선순위를 정해줄 필요가 있다.
        boolean boolA = (num % 3 == 0) && (num % 2 == 0) || (num > 0) && (num > 10);
        boolean boolB = (num % 3 == 0) && ((num % 2 == 0) || (num > 0)) && (num > 10);
    }
}
