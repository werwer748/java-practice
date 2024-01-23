package sec06.chap02.pkg1;

public class Friend {
    //  Parent와 같은 패키지
    Parent parent = new Parent();

    //? Child와의 차이점: 상속받지 못했기 때문에 꼭 Parent를 새로 생성하여 값을 가져옴
    //  int aa = new Parent().a; // ⚠️ 불가
    int bb = parent.b;
    int cc = parent.c; // 💡 protected - 같은 패키지, 비 상속관계
    int dd = parent.d;
}
