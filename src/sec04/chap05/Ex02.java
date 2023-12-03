package sec04.chap05;

/*
* 메소드의 의미2
* 값을 받고 연산하여 결과값을 반환 - 함수와 비슷.
*/
public class Ex02 {
    public static void main(String[] args) {
        //  ⭐️ 반환한다는 것: 바꿔 쓸 수 있다는 것
        //  메서드 실행문을 메서드의 반환값으로 치환
        int int1 = add(2, 3);
        System.out.println(int1);

        System.out.println(add(4, 5));

        int int2 = add(add(6, 7), add(8, 9));
        System.out.println(int2);

        System.out.println("\n- - - - -\n");

        if (
                checkIfContain(
                        "Hello World",
                        "hello"
                )
        ) {
            System.out.println("포함됨");
        } else {
            System.out.println("포함 안 됨");
        }

        // 간소화 해서 사용 가능
        System.out.println(
                checkIfContain(
                        "Hello World",
                        "hello"
                ) ? "포함됨" : "포함 안 됨"
        );
    }

    //! add라는 메소드 선언
    static int add (int num1, int num2) {
        // static 반환값타입(현재 int) 메서드명 (파라미터) { 수행할 내용 }
        return num1 + num2;
    }

    static boolean checkIfContain (String text, String token) {
        return text.toLowerCase().contains(token.toLowerCase());
    }

    /*
    ? static: 정적 메소드 (클래스 메소드)에서 호출하려면(main 등) 붙어야 함.
    * ㄴ 정적이 아닌 메소드 (인스턴스 메소드)는 객체지향 섹션에서 다시 보자.
    ? 매개변수 parameter: 각각 자료형과 변수명을 적음. 없을 시 빈 괄호
    * 호출할 때 넣는 값(ex_ add(3, 4)의 3, 4)을 인자 argument 라고 함
    ? return: 반환하는 값이 있을 때, 맨 마지막에 붙인다.
    * */
}
