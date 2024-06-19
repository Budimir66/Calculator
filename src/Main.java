import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input:");
        String s = reader.readLine();
        String[] arrS = s.split(" ");
        try {


            int num1 = Integer.parseInt(arrS[0]);
            int num2 = Integer.parseInt(arrS[2]);
            if (num1 > 10 || num2 > 10 || num1 < 1 || num2 < 1) {
                throw new IllegalArgumentException("Числа должны быть не больше 10 и не меньше 1");
            }
            if (arrS.length != 3) {
                throw new ArrayIndexOutOfBoundsException("пример должен состоять из одного действия");
            }

            int res = 0;

            switch (arrS[1]) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    res = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Неверная операция: " + arrS[1]);
            }
            System.out.println("Output: ");
            System.out.println(res);
        } catch (NumberFormatException e) {
            System.err.println("Ошибка преобразования числа: " + e.getMessage());
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

}







