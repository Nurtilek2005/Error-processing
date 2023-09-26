/* -----------------------------------------------------------------------------
### Задача №1 ###
--------------------------------------------------------------------------------
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
Метод divisionByZero - Деление на 0
Метод numberFormatException - Ошибка преобразования строки в число
Важно: они не должны принимать никаких аргументов
------------------------------------------------------------------------------ */

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = new int[5];
        System.out.println(array[6]);
    }

    public static void divisionByZero() {
        int number1 = 10;
        int number2 = 0;
        System.out.println(number1 / number2);
    }

    public static void numberFormatException() {
        String stringNumber = "number";
        int number = Integer.parseInt(stringNumber);
        System.out.println(number);
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}