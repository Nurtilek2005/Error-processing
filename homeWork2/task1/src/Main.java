/* -----------------------------------------------------------------------
### Задача №1 ###
--------------------------------------------------------------------------
Задание 4 из презентации
----------------------------------------------------------------------- */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
//            String strings1 = strings[2];
            String strings1 = strings[1];
            test();
//            int a = 1 / 0;
            int a = 4 / 2;
            try {
                File file = new File("sdafgdsaf");
                boolean result = file.createNewFile();
                inputStream = new FileInputStream("sdafgdsaf");
            } catch (FileNotFoundException error) {
                System.out.println("File not found");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IndexOutOfBoundsException error) {
            System.out.println("Index out of bound");
        } catch (ArithmeticException error) {
            System.out.println("Arithmetic exception");
        } catch (StackOverflowError error) {
            System.out.println("Stack overflow");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все ровно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
//        test();
    }
}