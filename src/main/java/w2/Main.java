package w2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        t10();
    }

    public static void t1() {
        Scanner scanner = new Scanner(System.in);
        String password = "carrot";

        while (true) {
            System.out.println("Please enter password: ");
            String providedPassword = scanner.nextLine();
            if (providedPassword.equals(password)) {
                System.out.println("Secret: kdskdjs");
                break;
            }
        }
    }

    public static void t2() {
        System.out.println("Please enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        System.out.println(first + second + third);
    }

    public static void t3() {
        int sum = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == 0) break;
            sum += number;
        }
        System.out.println(sum);
    }

    public static void t4() {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int last = scanner.nextInt();

        while (first < last-1) {
            System.out.println(++first);
        }
    }
    public static void t5() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((int)Math.pow(2, n));
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java");
    }
    public static void t6() {
        Scanner scanner = new Scanner(System.in);
        int howManyTimes = scanner.nextInt();
        for (int i = 0; i < howManyTimes; i++) {
            printText();
        }
    }

    //t7
    public static void drawStarsPiramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //t8
    public static void drawStarsPiramidInverted(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //t9
    public static void drawNumbersPiramid(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(Integer.toString(j) + ' ');
            }
            System.out.println();
        }
    }

    public static void t10() {
        int numberToGuess = 9;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();

            if (guess > 100 || guess < 0) {
                System.out.println("Invalid input: Number needs to be between 0 and 100");
                break;
            };

            if (guess < numberToGuess) {
                System.out.println("Upper");
            } else if (guess > numberToGuess) {
                System.out.println("Lower");
            }
            else {
                System.out.println("Correct");
                break;
            }
        }
    }

}