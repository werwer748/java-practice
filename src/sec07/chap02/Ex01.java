package sec07.chap02;

/*
* Wrapper 클래스들
* 각 원시 자료형에는 그에 해당하는 래퍼 클래스가 있음
*   - 해당 자료형에 관련된 클래스/인스턴스 기능들을 제공
*   - 클래스 인스턴스를 받는 곳에 활용
*       - 제내릭이라던지...
* 각 자료형의 원시값은 해당 래퍼 클래스의 인스턴스와 서로 변환 가능
* 💡 원시값의 존재 이유: 더 높은 성능
*   - 대신! 순수한 객체지향 언어는 아니게 된다.*/

public class Ex01 {
    public static void main(String[] args) {
        /*
        ? byte   | Byte
        ? short  | Short
        ? int    | Integer
        ? long   | Long
        ? float  | Float
        ? double | Double
        ? char   | Character
        ? boolean| Boolean
        */

        //  원시 자료형
        int int1 = 123;
        double dbl1 = 3.14;
        char chr1 = 'A';
        boolean bln1 = true;

        //  ⭐ 해당 래퍼 클래스의 인스턴스
        //  기존의 생성자 방식
        //  ⚠️ 오늘날에는 deprecated - 성능상 좋지 않음
        Integer int2 = new Integer(123);
        Double dbl2 = new Double(3.14);
        Character chr2 = new Character('A');
        Boolean bln2 = new Boolean(true);

        //  💡 아래의 클래스 메소드들이 권장됨
        Integer int3 = Integer.valueOf(123);
        Double dbl3 = Double.valueOf(3.14);
        Character chr3 = Character.valueOf('A');
        Boolean bln3 = Boolean.valueOf(true);
        Long lng3 = Long.valueOf(100);

        //⭐️  숫자 자료형들 (Integer , Double 등…) - 추상 클래스 Number 에서 상속
        Number num1 = int1;
        Number num2 = dbl1;
    }
}
