package sec08.chap02;

import sec07.chap03.ex06.*;

import java.util.*;

/*
* ArrayList
* 배열과 달리, 크기가 동적으로 증가 가능 (지정하지 않을경우 초기 공간 10)
*   - 공간과 요소의 수는 다를 수 있다.
* 배열처럼 메모리상에 연속으로 나열 => Array(배열)List
* 공간 초과 시 추가 공간 확보
*   - 더 넓은 공간을 확보한 뒤 요소들 복사 (더 넓은 땅으로 이주를 한다~)
* 중간의 요소 제거 시 이후 요소들을 당겨옴.
*
* 용도?
* 장점: 각 요소들로의 접근이 빠름
* 단점: 요소 추가/제거 시 성능 부하, 메모리를 더 차지함
* 변경이 드물고 빠른 접근이 필요한 곳에 적합
*/

/*
* LinkedList
* Queue 구현하는 용도로 사용 가능
* 기능상 ArrayList와 대다수 주요 기능 공유 => ArrayList를 LinkedList로 변경해도 문제가 생기지는 않음
* 각 요소들이 메모리 이곳 저곳에 산재
*   - 각각 이전/다음 요소들로의 링크가 있음 (비상연락망처럼...)
*   - 요소 추가시 해당 요소의 메모리만 확보 후 링크
*   - 요소 제거시 그 이전 요소와 다음 요소 연결
*
* 용도?
* 장점: 요소의 추가와 제거가 빠름, 메모리 절약됨
* 단점: 요소 접근이 느림
* 요소들의 추가/지거가 잦은 곳에 적합*/

public class Main {
    public static void main(String[] args) {
        //  ⭐️ 제네릭을 사용하여 타입 지정
        //  - 붙이지 않을 시 <Object>와 동일
        ArrayList<Integer> ints1 = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        LinkedList<Knight> knights = new LinkedList<>();

        ints1.add(11);
        ints1.add(22);
        ints1.add(33);
        ints1.add(44);
        ints1.add(55);

        // 중복값도 다 들어감
        for (String str: "바니 바니 바니 바니 당근 당근".split(" ")) {
            strings.add(str);
        }

        // for-each 문 사용 가능
        for (int i : ints1) {
            System.out.println(i);
        }

        int ints1Size = ints1.size(); // 요소 개수
        boolean ints1IsEmpty = ints1.isEmpty(); // size가 0인지 확인
        int ints12nd = ints1.get(1); // 인덱스로 요소 접근
        boolean ints1Con3 = ints1.contains(33); // 포함 여부
        boolean ints1Con6 = ints1.contains(66); // 포함 여부

        ints1.set(2, 444); // 해당 위치의 요소를 수정 -> 2번째를 444로
        ints1.add(0, 11); // 해당 위치에 요소를 추가, 기존 요소들은 밀림 -> 0번째에 11을 추가

        //  ⭐️ 간략한 생성 및 초기화 방법들
        ArrayList<Integer> ints2A = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        ); // 💡 Arrays 클래스 : 배열 관련 각종 기능 제공

        ArrayList<Integer> ints2B = new ArrayList<>(
                List.of(1, 2, 3, 4, 5)
        ); // 💡 자바9에서부터 가능

        ArrayList<Integer> ints2C = new ArrayList<>();
        // ints2C 여기다가 요소들을 집어넣어 줌
        Collections.addAll(ints2C, 1, 2, 3, 4, 5);

        //  💡 다른 Collection 인스턴스를 사용하여 생성
        ArrayList<Integer> ints3 = new ArrayList<>(ints1);

        //  스스로를 복제하여 반환 (⚠️ 얕은 복사)
        ArrayList<Integer> ints4 = (ArrayList<Integer>) ints3.clone();

        ints3.remove(4); // 인덱스로 지우기
        ints3.remove((Integer) 11); // 클래스 자료형: 요소로 지우기 - 같은값 여러개있으면 가장 앞의 하나만 삭제됨

        ints1.removeAll(ints3); // 주어진 콜렉션에 있는 요소들 지우기

        ints1.addAll(ints3); // 콜렉션 이어 붙이기

        //  💡 toArray - Object 배열 반환
        Object[] intsAry2_Obj = ints1.toArray();

        //  ⭐️ 특정 타입의 배열로 반환하려면?
//          Integer[] ints1Ary1 = (Integer[]) ints1.toArray(); // ⚠️ 이렇게는 불가
        //  💡 인자로 해당 타입 배열의 생성자를 넣어줌
        Integer[] ints1Ary2 = ints1.toArray(Integer[]::new);

        ints1.clear();

        // 제네릭 적용
        numbers.add(Integer.valueOf(123));
        numbers.add(3.14);
//        numbers.add("Hello"); // ⚠️ 불가

//        knights.add(new Swordman(Side.BLUE)); // ⚠️ 불가
        knights.add(new Knight(Side.BLUE));
        knights.add(new MagicKnight(Side.BLUE));

        //  와일드카드 적용
        //  기사 이상의 그룹으로만 편성될 수 있는 정예분대
        ArrayList<? extends Knight> eliteSquad;
//        ArrayList<? super Knight> eliteSquad;

//        eliteSquad = new ArrayList<Swordman>(); // ⚠️ 불가
        eliteSquad = new ArrayList<Knight>();
        eliteSquad = new ArrayList<MagicKnight>();

        //  ⭐️ 인스턴스 요소를 지울 때는 참조를 기준으로
        //  - 내용이 같다고 같은 인스턴스가 아님
        Knight knight1 = new Knight(Side.RED);
        knights.add(knight1);

        //  요소가 하나 지워졌는지 여부 반환
        boolean removed1 = knights.remove(new Knight(Side.RED)); // 모양이아니라 주소를 참조한다!
        boolean removed2 = knights.remove(knight1);


        //  ⭐️ 둘의 차이와 연관지어 생각해 볼 것(ArrayList, LinkedList)
        //  💡 ArrayList에만 있는 메소드들 중...
        ArrayList<Attacker> attackers = new ArrayList<>();
        attackers.ensureCapacity(5); // 자리수 미리 확보
        attackers.trimToSize(); // 남는 자리 없애기 (메모리 회수)

        //  💡 LinkedList에만 있는 메소드들 중...
        LinkedList<Integer> intNums = new LinkedList<>();
        for (int intNum: new int[] {2, 3, 4}) {
            intNums.add(intNum);
        }

        intNums.addFirst(1);
        intNums.addFirst(0);
        intNums.addLast(5); // add와 반환값이 다르다.
        intNums.addLast(6);

        //  💡 앞에서/뒤에서 꺼내지 않고 반환
        //  - peek~ : 비어있을 경우 null 반환
        //  - get~ : 비어있을 경우 익셉션
        int peekedFirst = intNums.peekFirst();
        int gottenFirst = intNums.getFirst();
        int peekedLast = intNums.peekLast();
        int gottenLast = intNums.getLast();

        //  💡 앞에서/뒤에서 꺼내어 반환
        //  - poll~ : 비어있을 경우 null 반환
        //  - remove~ : 비어있을 경우 익셉션
        int polledFirst = intNums.pollFirst();
        int removedSecond = intNums.removeFirst();
        int polledLast = intNums.pollLast();
        int removedLast = intNums.removeLast();

        //  ⭐️ 위의 기능들 활용하여 Stack/Queue 구현

        LinkedList<Character> charLList = new LinkedList<>();

        //  💡 push & pop : 스택 간편하게 구현
        //  - 클래스 코드에서 살펴볼 것

        charLList.push('A');
        charLList.push('B');
        charLList.push('C');
        charLList.push('D');
        charLList.push('E');

        char pop1 = charLList.pop();
        char pop2 = charLList.pop();
        char pop3 = charLList.pop();

        /*
        * ### ⚠️ `Arrays`의 `ArrayList`

        *    - `Arrays.asList` 가 반환하는 `ArrayList`
        *    - `ArrayList`와는 다름
        *        - `java.util.Arrays` 의 정적 내부 클래스
        *        - 사이즈 변경 불가 (요소 추가 안 됨)
        */

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        ArrayList<Integer> list2 = new ArrayList<>(list1);

        String list1Type = list1.getClass().getName();
        String list2Type = list2.getClass().getName();

//        list1.add(6); // ⚠️ 런타임 오류

        //? 실무에서는 컬렉션 자료형을 인터페이스로 많이(대부분?) 쓴다.
        /*
        * - `List` , `Set` , `Map` 등의 인터페이스로 변수, 인자, 제네릭 등의 자료형 지정
        * - 상세구현이 어떤 알고리즘으로 되어있는지는 굳이 드러내지 않음
        * - 필요에 따라 다른 종류로 교체가 용이
        */
        List<Integer> intList = new ArrayList<>();
        intList = new LinkedList<>();

        Set<String> strSet = new HashSet<>();
        strSet = new TreeSet<>();

        Map<Integer, String> intStrMap = new HashMap<>();
        intStrMap = new TreeMap<>();
    }
}
