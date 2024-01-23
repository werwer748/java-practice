package sec06.chap07.ex01;

/*
* 레코드
* 자바 14에서 Preview로 추가, 16에서 정식 등록
* 데이터의 묶음을 저장하기 위한, 단순한 형태의 클래스
*/

public enum Gender {
    MALE("👦🏻"), FEMALE("👧🏼");

    private String emoji;
    Gender(String emoji) { this.emoji = emoji; }
    public String getEmoji() { return emoji; }
}
