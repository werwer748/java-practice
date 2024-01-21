package sec05.chap09.ex01;

public interface Hunter {
    //? 기본적으로 인터페이스에서 필드는 public static final
    String position = "포식자"; // ⭐️ final - 초기화하지 않을 시 오류

    //? 기본적으로 인터페이스에서 메소드는 public abstract
    void hunt();
}
