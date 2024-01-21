package sec05.chap07;

/*
* final?
* 값을 변경할 수 없다.
* 필드 선언시 또는 생성자에서 초기화해야 한다.
*/
public class YalcoChicken {

    protected static final String CREED = "우리의 튀김옷은 얄팍하다.";

    private final int no;
    public String name;

    //  ⭐️ 필수 - no가 final이고 초기화되지 않았으므로
    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void changeFinalFields () {
        // ⚠️ 불가
//        this.no++;
    }

    /*
    ? 메소드에 final이 붙으면?
    ? 오버라이드를 못하게 막는다.
    ? 만들어둔데로만 쓰라는 얘기
    */
    public final void fryChicken () {
        System.out.println("염지, 반죽입히기, 튀김");
    }
}
