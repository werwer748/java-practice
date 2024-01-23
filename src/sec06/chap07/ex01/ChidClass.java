package sec06.chap07.ex01;

// 기존처럼 클래스로 작성하는 경우
public class ChidClass {
    private final String name;
    private final int birthYear;
    private final Gender gender;

    public ChidClass(String name, int birthYear, Gender gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Gender getGender() {
        return gender;
    }
}
