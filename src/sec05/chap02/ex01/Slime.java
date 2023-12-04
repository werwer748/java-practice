package sec05.chap02.ex01;

/*
 * 예제 1. 슬라임 클래스
 * 생성자를 필요로 하지 않음
 * 필드들이 기본 값을 가짐
 * 인스턴스를 인자로 받는 메소드
 */

public class Slime {
    double hp = 50;
    int attack = 8;
    double defense = 0.2;

    void attack (Slime enemy) {
        enemy.hp -= attack * (1 - enemy.defense);
    }
}
