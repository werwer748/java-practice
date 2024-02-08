package sec08.chap03;

// * 셋: 중복되지 않는 요소들의 집합
/*
* 주요 클래스        |장점                      | 단점
* HashSet         |성능이 빠르고 메모리 적게 사용  | 순서 관련 기능 없음(보장하지 않음)
*
* LinkedHashSet   |요소들을 입력 순서대로 정렬     | HashSet 보다는 성능 떨어짐
*                 |(내부적으로 링크 사용)
*
* TreeSet         | 요소들을 특정 기준대로 정렬    | 데이터 추가/삭제에 시간 더 소모
*                   (기본 오름차순)
* */

import sec07.chap03.ex06.Knight;
import sec07.chap03.ex06.Side;
import sec07.chap03.ex06.Swordman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> intHSet1 = new HashSet<>();
        intHSet1.add(1);
        intHSet1.add(1);
        intHSet1.add(2);
        intHSet1.add(3);

        List<Integer> ints1 = new ArrayList(
                Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 7)
        );
        Set<Integer> intHSet2 = new HashSet<>(ints1);

        //  💡 for-each문 사용 가능
        for (Integer i :intHSet1) {
            System.out.println(i);
        }

        //  ⭐️ 아래와 같이 응용 가능
        //  - 중복을 제거한 ArrayList
        ints1.clear();
        ints1.addAll(intHSet2);

        /*
        * 해시 hash - 해시셋이 사용하는 방식
        * 동일한 입력값 => 언제나 동일한 출력값
        * 값마다의 고유한 정수값을 해시값으로 저장
        *   - 이 값을 기준으로 정렬
        * 일정 개수까지는 정렬(된 형태), 이를 넘어서면 재조정
        *   - 정렬을 목적으로는 사용하지 말 것*/

        //  포함 여부
        boolean has2 = intHSet1.contains(2);
        boolean has4 = intHSet1.contains(4);

        //  요소 삭제, 있었는지 여부 반환
        boolean rm3 = intHSet1.remove(3);
        boolean rm4 = intHSet1.remove(4);

        //  다른 콜렉션 기준으로 내용 삭제
        intHSet2.removeAll(intHSet1);

        //  💡 그 외 size, isEmpty, clear, clone 등의 메소드들 확인

        //  참조형 관련
        Set<Swordman> swordmanSet = new HashSet<>();
        Swordman swordman = new Swordman(Side.RED);

        swordmanSet.add(swordman);
        swordmanSet.add(swordman);
        swordmanSet.add(new Swordman(Side.RED));
        swordmanSet.add(new Swordman(Side.RED));
        swordmanSet.remove(swordman);

        HashSet<Integer> intHashSet = new HashSet<>();
        LinkedHashSet<Integer> intLinkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> intTreeSet = new TreeSet<>();

        for (int i : new int[] { 3, 1, 8, 5, 4, 7, 2, 9, 6 }) {
            intHashSet.add(i);
            intLinkedHashSet.add(i);
            intTreeSet.add(i);
        }

        for (Set s : new Set[] { intHashSet, intLinkedHashSet, intTreeSet} ) {
            System.out.println(s);
        }
        //  ⭐️ LinkedHashSet : 입력된 순서대로 / TreeSet : 오름차순
        //  ⚠️ HashSet이 정렬된 것처럼 보이지만 보장된 것이 아님
        //  - Hash 방식에 의한 특정 조건에서의 정렬일 뿐

        Set<String> strHashSet = new HashSet<>();
        Set<String> strLinkedHashSet = new LinkedHashSet<>();
        TreeSet<String> strTreeSet = new TreeSet<>();

        for (String s : new String[] {
                "Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice"
        }) {
            strHashSet.add(s);
            strLinkedHashSet.add(s);
            strTreeSet.add(s);
        }
        for (Set s : new Set[] {strHashSet, strLinkedHashSet, strTreeSet}) {
            System.out.println(s);
        }

        //  💡 TreeSet의 주요 메소드들
        int firstInt = intTreeSet.first();
        String lastStr = strTreeSet.last();

        //  같은 것이 없다면 트리구조상 바로 위의 것 (바로 더 큰 것) 반환
        String foxCeiling = strTreeSet.ceiling("Fox");
        String creamCeiling = strTreeSet.ceiling("Cream");

        // 같은 것이 없다면 트리구조상 바로 아래 것(작은 것) 반환
        String foxFloor = strTreeSet.floor("Fox");
        String diceFloor = strTreeSet.floor("Cream");

        // 맨 앞에서/뒤에서 제거
        int pollFirst1 = intTreeSet.pollFirst();
        int pollFirst2 = intTreeSet.pollFirst();

        int pollLast1 = intTreeSet.pollLast();
        int pollLast2 = intTreeSet.pollLast();

        //  순서가 뒤집힌 NavigableSet 반환
        Set<String> strTreeSetDesc = (TreeSet<String>) strTreeSet.descendingSet();

        //  ⚠️ 요소로 추가 불가 => 상하관계를 잡을수 있는 기준이 없기 떄문에...
        //  - 이후 배울 Comparable 또는 Comparator 필요
//        TreeSet<Knight> knightSet1 = new TreeSet<>();
//        knightSet1.add(new Knight(Side.BLUE));
//        knightSet1.add(new Knight(Side.BLUE));
//        knightSet1.add(new Knight(Side.BLUE));
    }
}
