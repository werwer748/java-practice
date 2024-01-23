package sec06.chap02.pkg5;

import java.awt.*;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

/*
* ### ⭐️ `java.lang` 패키지

*  - 자바 라이브러리에 기본으로 포함
*    - 프로그래밍에 널리 사용되는 핵심적인 클래스들
* - 임포트하지 않아도 되는 패키지
*    - `System`, `String` 등을 임포트하지 않아도 되는 이유
*    - 다른 라이브러리 패키지들은 임포트해야 함
*/
public class Main {
    public static void main(String[] args) {
        //  java.lang 패키지에 속한 기본 라이브러리 클래스들
        System.out.println("이 클래스들은 왜 임포트를 안 해도 될까요?");
        Object object = new Object();
        String str = new String("java.lang 패키지 소속이라 그럼");
        Integer integer;
        Math math;

        //  다른 패키지에 속한 기본 라이브러리 클래스들
        ArrayList arrayList;
        Calendar calendar;
        Optional optional;
        Iterator iterator;
        InputStream inputStream;
        Serializable serializable;
        Stream stream;
        Button button;
    }
}
