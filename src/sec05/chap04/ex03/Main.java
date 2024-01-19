package sec05.chap04.ex03;

public class Main {
    public static void main(String[] args) {

        Product ballpen = new Product("볼펜", 1000);

        ballpen.setName("삼색볼펜");
        ballpen.setName("");

        int ballPenPrice = ballpen.getPrice();

        ballpen.setPrice(1500);
    }
}
