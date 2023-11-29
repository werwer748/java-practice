package sec03.chap04;

/*
* 단축평가 - short circuit
* &&: 앞의 것이 false면 뒤의 것을 평가할 필요가 없음
* ||: 앞의 것이 true면 뒤의 것을 평가할 필요 없음
* 평가는 곧 실행 - 이 부분을 이용하여 코드를 간결화한다
* 다시 말해 연산 부하가 적은 코드를 앞에 두자.
*/

public class Ex03 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 0, d = 0, e = 0, f = 0;

        boolean bool1 = a < b && c++ < (d += 3);
        boolean bool2 = a < b || e++ < (f += 3);

        boolean bool3 = a > b && c++ < (d += 3); // 🔴
        boolean bool4 = a > b || e++ < (f += 3);
    }
}
