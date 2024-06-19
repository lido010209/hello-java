import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        // '/' 두개는 Java늬 한줄 주석입니다.
        // 이건 Java가 코드로서 생각하지 않으며
        // 실행할때 무시하는 줄입니다.

        /* 요 사인는 전부 주석입니다.

         */

        // System.out.println()는 출력
        System.out.println("Hello Luna!!!");
        System.out.println("Nice to meet you!");
        System.out.println(2024);
        System.out.println(6.19);
        System.out.println(15*3);

        // Scanner는 입력을 받기 위한 도구이다.
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

        // CTRL + / 또는 CMD + /
        System.out.println("Intellij에서 CTRL+/ 하면 주석이다.")

    }
}
