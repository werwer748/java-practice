package sec05.chap05.ex03;

/*
* 부모 클래스에 명시된 생성자가 없는 경우
* 자식 클래스에서도 작성할 필요가 없음
*/
public class Slime {
    protected double hp = 50;
    protected int attack = 8;
    protected double defense = 0.2;

    public void attack (Slime enemy) {
        enemy.hp -= this.attack * (1 - enemy.defense);
    }
}
