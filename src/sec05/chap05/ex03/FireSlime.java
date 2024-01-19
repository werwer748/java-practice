package sec05.chap05.ex03;

//? 상속은 자신이 만든 것이 아닌 클래스를 커스터마이즈 할 때도 사용 가능.
public class FireSlime extends Slime{
    private int fireAttack = 4;

    @Override
    public void attack(Slime enemy) {
        enemy.hp -= (attack + fireAttack) * (1 - enemy.defense);
    }
}
