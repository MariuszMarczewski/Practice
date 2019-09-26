package HrabiaVonPesel;

import java.util.Scanner;

public class CheckYourPesel {

    public static boolean check(String PESEL) {

        int[] number = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

        if (PESEL.length() != 11) return false;

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += Integer.parseInt(PESEL.substring(i, i + 1)) * number[i];
        }

        int checkNumber = Integer.parseInt(PESEL.substring(10, 11));
        sum %= 10;
        sum = 10 - sum;
        sum %= 10;

        return (sum == checkNumber);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj nr PESEL: ");

        String PESEL = in.nextLine();

        if (check(PESEL) == true) {
            System.out.println("Twój nr PESEL jest poprawny");
        } else {
            System.out.println("Twój nr PESEL nie jest poprawny");

        }
    }
}
