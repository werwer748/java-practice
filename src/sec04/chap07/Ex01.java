package sec04.chap07;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // import java.util.Scanner
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.nextLine();

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
