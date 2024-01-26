package sec07.chap01.ex04;

/*
* clone 메소드
*   - 인스턴스가 스스로를 복사하기 위해 사용
*   - Cloneable 인터페이스 구현 권장
*   - 깊은 복사는 직접 오버라이드하여 구현해 주어야 함
*/

public class Click {
    int x;
    int y;

    public Click(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
