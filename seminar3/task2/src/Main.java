/* --------------------------------------------------------------------------------
### Задача №2 ###
-----------------------------------------------------------------------------------
Создайте метод doSomething(), который может быть источником одного из типов checked
 exceptions (тело самого метода прописывать необязательно). Вызовите этот метод
 из main и обработайте в нем исключение, которое вызвал метод doSomething().
-------------------------------------------------------------------------------- */

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        try {
            doSomething();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void doSomething() throws IOException {
        FileWriter writer = new FileWriter("");
    }
}