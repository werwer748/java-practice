package sec08.chap05.ex02;

/*
* Comparable(비교의대상): 자신과 다른 객체를 비교
*   - 숫자 클래스들, 불리언, 문자열
*   - 이후 배울 Date, BigDecimal, BigInteger 등..
*/

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet[] treeSets = {
                new TreeSet<>(),
                new TreeSet<>(new PersonComp(PersonComp.SortBy.NO, PersonComp.SortDir.DESC)),
                new TreeSet<>(new PersonComp(PersonComp.SortBy.AGE, PersonComp.SortDir.ASC)),
                new TreeSet<>(new PersonComp(PersonComp.SortBy.HEIGHT, PersonComp.SortDir.DESC))
        };

        for (Person p : new Person[] {
                new Person("홍길동", 20, 174.5),
                new Person("전우치", 28, 170.2),
                new Person("임꺽정", 24, 183.7),
                new Person("황대장", 32, 168.8),
                new Person("붉은매", 18, 174.1),
        }) {
            for (TreeSet ts: treeSets) {
                ts.add(p);
            }
        }

        for (TreeSet ts: treeSets) {
            for (Object p : ts) {
                System.out.println(p);
            }
            System.out.println("\n- - - - -\n");
        }
    }
}
