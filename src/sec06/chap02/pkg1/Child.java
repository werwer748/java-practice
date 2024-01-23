package sec06.chap02.pkg1;

public class Child extends Parent {
    // Parent와 같은 패키지

    /*
     * private으로 선언되어서 자식 클래스에서 사용할 수가 없음
     * 단! 상속을 못받는다는 것은 아니다.
     * 물려받아 갖고만 있고 손을 대지는 못한다는 의미
     */
    //  int aa = a; // ⚠️ 불가

    int bb = b;
    int cc = c;
    int dd = d;

    public static class Friend {
        //  Parent와 같은 패키지
        Parent parent = new Parent();

        //  int aa = new Parent().a; // ⚠️ 불가
        int bb = parent.b;
        int cc = parent.c; // 💡 protected - 같은 패키지, 비 상속관계
        int dd = parent.d;
    }
}
