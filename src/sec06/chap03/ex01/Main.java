package sec06.chap03.ex01;

/*
* - 보다 강력한 캡슐화
*   - 외부/내부 클래스간의 관계가 긴밀할 때 사용
* - 적절히 사용시 유지보수가 용이하고 가독성을 높여줌
*   - 과하게 사용되면 클래스 비대화
*/

public class Main {
    public static void main(String[] args) {
        //  ⭐️ 클래스가 클래스 필드인 것 - 아래의 변수는 인스턴스
        Outer.InnerSttcMember staticMember = new Outer.InnerSttcMember();
        staticMember.func();

        System.out.println("\n- - - - -\n");

        Outer outer = new Outer();
        outer.innerFuncs();

        System.out.println("\n- - - - -\n");


        //  ⚠️  아래와 같은 사용은 불가
        //  Outer.InnerInstMember innerInstMember = new outer.InnerInstMember();

        //  💡 인스턴스 내부 클래스는 이렇게 얻을 수 있음
        Outer.InnerInstMember innerInstMember = outer.getInnerInstMember();
        innerInstMember.func();

        System.out.println("\n- - - - -\n");

        outer.memberFunc();
    }
}
