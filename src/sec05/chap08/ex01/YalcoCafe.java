package sec05.chap08.ex01;

public class YalcoCafe extends  YalcoGroup {
    public static String getCreed() {
        return CREED.formatted("원두향은");
    }
    protected static int lastNo = 0;

    private boolean isTakeout;

    //? 생성자에 추가로 값이 필요함(부모보다 많은 값이 필요함)
    //? 먼저 super(++lastNo, name); 부모값을 주고
    //? 본인 생성에 필요한 값을 생성자에 쓰면 된다.
    public YalcoCafe(String name, boolean isTakeout) {
        super(++lastNo, name);
        this.isTakeout = isTakeout;
    }

    //  💡 반드시 구현 - 제거해 볼 것

    @Override
    public void takeOrder() {
        System.out.printf("얄코카페 %s 음료를 주문해주세요.%n", super.intro());
        if (!isTakeout) System.out.println("매장에서 드시겠어요?");
    }
}
