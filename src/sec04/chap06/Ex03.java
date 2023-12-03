package sec04.chap06;

/*
* 재귀 메소드
* 스스로를 호출하는 메소드
* 호출시마다 메모리에 스택이 축적 - 초과시 스택오버플로우(메모리허용량 초과로 컴퓨터가 뻗는) 에러
*/
public class Ex03 {
    public static void main(String[] args) {
        upTo5(0);
//        upTo5(2);
//        upTo5(4);

        int fact1 = factorial(1);
        int fact2 = factorial(2);
        int fact3 = factorial(3);
        int fact4 = factorial(4);
        int fact5 = factorial(5);
    }

    static int factorial (int num) {
        return num == 0 ? 1 : num * factorial(--num);
    }

    static void upTo5 (int start) {
        System.out.println(start);
        if (start < 5) {
            upTo5(++start);
        } else {
            System.out.println("-- 종료 --");
        }
    }
}
