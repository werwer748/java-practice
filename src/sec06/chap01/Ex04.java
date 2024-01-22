package sec06.chap01;

public class Ex04 {
    public static void main(String[] args) {
        new Ex04().printKings();
    }

    String king = "사자"; // 클래스의 필드

    void printKings () {
        String king = "여우"; // 💡 메소드의 변수

        //  ⭐️ 인스턴스의 필드는 다른 영역으로 간주
        System.out.printf(
                "인스턴스의 왕은 %s, 블록의 왕은 %s%n",
                this.king, king // 변수로 선언된 여우를 가리면 둘다 사자로 인식
        );
    }
}
