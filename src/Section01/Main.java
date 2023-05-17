package Section01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        System.out.println("입력한 문자열: " + input);

        scanner.close();
    }
}
