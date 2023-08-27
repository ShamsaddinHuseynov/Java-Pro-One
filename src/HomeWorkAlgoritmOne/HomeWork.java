package HomeWorkAlgoritmOne;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type firth Number: ");
        int number1 = sc.nextInt();
        System.out.print("Type second Number: ");
        int number2 = sc.nextInt();
        System.out.print("Type third Number: ");
        int number3 = sc.nextInt();

        int sum = number1 + number2 + number3;
        System.out.println("Sum of three numbers: " + sum );

    }
}
//        Псевдокод:
//        1. Ввод первого числа (num1)
//        2. Ввод второго числа (num2)
//        3. Ввод третьего числа (num3)
//        4. Вычисление суммы (sum = num1 + num2 + num3)
//        5. Вывод суммы на экран