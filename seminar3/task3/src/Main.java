/* --------------------------------------------------------------------------
### Задача №3 ###
-----------------------------------------------------------------------------
Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
можно было работать в блоке try-with-resources. Подумайте, что должно
происходить при закрытии этого ресурса? Напишите метод для проверки,
закрыт ли ресурс. При попытке вызвать add() у закрытого ресурса,
должен выброситься IOException
-------------------------------------------------------------------------- */

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        try (Counter counter = new Counter()) {
            System.out.println("Starting value: " + counter.getCount());
            counter.add();
            System.out.println("First add: " + counter.getCount());
            counter.add();
            counter.add();
            counter.add();
            System.out.println("Second add: " + counter.getCount());
            counter.reset();
            System.out.println("Reset: " + counter.getCount());
            counter.add();
            counter.add();
            System.out.println("Third add: " + counter.getCount());
            counter.close();
            counter.add();
            System.out.println("Closed: " + counter.getCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}