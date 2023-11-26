package sec03.chap01;

/*
* 이항 연산자
* 좌우의 두 값을 계산한 뒤 결과를 반환
* 부수효과를 일으키지 않음
*/

public class Ex03 {
    public static void main(String[] args) {
        int a = 1 + 2;
        int b = a - 1;
        int c = a * b;
        int d = a + b * c / 3;
        int e = (a + b) * c / 3;
        int f = e % 4;
    }
}
