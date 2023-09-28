/* ---------------------------------------------------------------------------------
### Задача №4 ###
------------------------------------------------------------------------------------
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую
строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
--------------------------------------------------------------------------------- */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        String message = new String();
        try {
            message = this.promptLine("Введите имя");
        } catch (Exception e) {
            System.out.println("Пустые строки вводить нельзя!");
        } finally {
            System.out.println("Вы ввели '%s'".formatted(message));
        }
    }

    public String promptLine(String message) throws Exception {
        String result = null;
        System.out.print(message + ": ");
        Scanner iScanner = new Scanner(System.in);

        result = iScanner.nextLine();
        if (result == null || result.strip().equals("")) {
            throw new Exception("Got empty line!");
        }
        return result;
    }
}