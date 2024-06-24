import java.util.Scanner;

public class Newcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        String s = sc.nextLine();
        String[] as = s.split(" ");
        if (as.length != 3) {
            throw new IllegalArgumentException("Некорректно введены данные:\n"
                    + "Пример должен состоять из одного математического действия,\n"
                    + "Данные должны вводиться одной строкой,\n"
                    + "Цифры и операторы должны разделены пробелами.");
        }
        try {
            int ai = Integer.parseInt(as[0]);
            int bi = Integer.parseInt(as[2]);
            char ch = as[1].charAt(0);

            if (ai > 10 || bi > 10 || ai < 1 || bi < 1) {
                throw new IllegalArgumentException("Числа должны быть не больше 10 и не меньше 1.");
            }
            if (ch == '+') {
                int r = ai + bi;
                System.out.println("Output: " + r);
            } else if (ch == '-') {
                int r = ai - bi;
                System.out.println("Output: " + r);
            } else if (ch == '*') {
                int r = ai * bi;
                System.out.println("Output: " + r);
            } else if (ch == '/') {
                int r = ai / bi;
                System.out.println("Output: " + r);
            } else {
                throw new IllegalArgumentException("Введён неверный оператор математического действия: " + ch);
            }
        } catch (NumberFormatException e) {
            System.err.println("Введено нечисленное значение: " + e.getMessage());
        }
    }
}














