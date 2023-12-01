package sec03.chap07;

// * 포메팅
/*
* %b : 불리언
* %d : 10진수 정수
* %f : 실수
* %c : 문자
* %s : 문자열
* %n : 포맷 문자열 내 바꿈
*/
public class Ex01 {
    public static void main(String[] args) {
        String str1 = "%s의 둘레는 반지름 X %d X %f입니다.";

        String circle = "원";
        int two = 2;
        double PI = 3.14;

        //  💡 formatted : 주어진 형식에 따라 문자열 생성
        //  ⭐️ 13+버전에 추가됨. 편의상 강의에서 많이 사용할 것
        String str2 = str1.formatted(circle, two, PI);

        //  💡 이전 버전에서의 방식. 실무에서 사용하려면 기억
        String str3 = String.format(str1, circle, two, PI);

        System.out.printf((str1) + "%n", circle, two, PI);
        System.out.println(str1.formatted(circle, two, PI));
        System.out.println(str1.formatted(circle, two, PI));

        System.out.println("\n- - - - -\n");
        //  ⭐️ 시스템의 printf 메소드 : String.format과 같은 형식으로 출력
        //  줄바꿈을 하지 않으므로 직접 넣어줘야 함
        System.out.printf("%s의 둘레는 반지름 X %d X %f입니다.%n", circle, two, PI);
        System.out.printf("%s의 둘레는 반지름 X %d X %f입니다.%n", circle, two, PI);
        System.out.printf("%s의 둘레는 반지름 X %d X %f입니다.%n", circle, two, PI);

        // n은 OS별로 다르게 입력되는데 (윈도우: \r\n, 맥, 리눅스: \n) %n은 일정하게 줄바꿈이 되도록 알아서 개행문자를 넣어준다.
    }
}
