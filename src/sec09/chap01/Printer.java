package sec09.chap01;

/**
 * 함수형 인터페이스 FunctionalInterface
 * 람다식 형태로 익명 클래스가 만들어질 수 있는 인터페이스
 * 추상 메소드가 하나만 있어야 한다.
 *  - 람다식과 1:1로 대응될 수 있어야함
 *  - @FunctionalInterface 어노테이션으로 강제
 *  - 클래스 메소드와 default 메소드는 여럿 있을 수 있음
 *  - 예외도 존재함
 */

@FunctionalInterface
public interface Printer {
    void print ();

    //  void say (); // ⚠️ 둘 이상의 메소드는 불가
}
