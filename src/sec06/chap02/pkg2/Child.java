package sec06.chap02.pkg2;

//? 다른 패키지에서 가져와서 임포트가 필요함
import sec06.chap02.pkg1.Parent;

public class Child extends Parent {
    //  Parent와 다른 패키지
    //  int aa = a; // ⚠️ 불가

    //? 다른집 자식이라 default선언된 값을 사용할 수 없음
//      int bb = b; // ⚠️ 불가

    int cc = c; // 💡 protected - 다른 패키지, 상속관계
    int dd = d;
}
