package sec04.chap01;

public class Ex02 {
    public static void main(String[] args) {
        boolean willOrderCoffee = !true;
        boolean likeMilk = false;
        boolean likeIce = true;
        boolean likeSweet = false;
        boolean angry = !false;
        int myRank = 2;

        // * if의 중첩사용
        if (willOrderCoffee) {
            // * 블록 내부에서 선언된 변수는 블로 내에서만 사용됨
            String toOrder = "";

            toOrder = likeMilk ? "라떼" : "아메리카노";
            if (likeIce) toOrder = "아이스 " + toOrder;
            if (!likeSweet) toOrder += " 안단티노";

            System.out.printf("저는 %s 할게요%n", toOrder);
        } else {
            if (!angry || myRank > 3) {
                System.out.println("저는 괜찮아요.");
            } else {
                System.out.println("너님들끼리 드세요.");
            }
        }
    }
}
