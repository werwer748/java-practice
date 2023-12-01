package sec03.chap06;

/*
* 문자열은 불변 immutable
* - 문자열 스스로를 변경하는 메소드는 없음 = "문자열은 고쳐 쓰는 거 아니다"
*   - 새 문자열 또는 다른 값을 반환
*   - ⚠️문자열 변수에 다른 값을 넣을 수 없다는 뜻이 아님
*/

public class Ex01 {
    public static void main(String[] args) {
        int int1 = "".length();
        int int2 = "헬로".length();
        int int3 = "Hello".length();
        int int4 = "김수한무 거북이와 두루미".length();

        int int5 = "안녕하세요".length();
        String str = "Hello World";
        int int6 = str.length();
    }
}
