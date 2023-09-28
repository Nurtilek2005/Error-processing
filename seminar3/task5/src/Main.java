/* -----------------------------------------------------------------------------------------------
### Задача №5 ###
--------------------------------------------------------------------------------------------------
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
   При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
   Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
   или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
   в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
   и MyArrayDataException и вывести результат расчета (сумму элементов,
   при условии, что подали на вход корректный массив).
----------------------------------------------------------------------------------------------- */

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        String[][] array = new String[][]{
                {"3", "4", "2", "3"},
                {"3", "2", "3", "4"},
                {"5", "4", "3", "2"},
                {"4", "3", "5", "2"}
        };
        try {
            int[][] numArray = this.convertStringToNumArr(array);
            int sum = this.sumQuadNumArray(numArray);
            System.out.println(sum);
        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public int[][] convertStringToNumArr(String[][] strArray) throws MyArraySizeException, MyArrayDataException {
        int size = strArray.length;
        if (size != strArray[0].length) {
            throw new MyArraySizeException("Размер массива не квадратный");
        }
        int[][] numArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!strArray[i][j].matches("[0-9]")) {
                    throw new MyArrayDataException("Значение i = %d, j = %d не числовой!".formatted(i, j));
                }
                int number = Integer.parseInt(strArray[i][j]);
                numArray[i][j] = number;
            }
        }
        return numArray;
    }

    public int sumQuadNumArray(int[][] numArray) {
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                sum += numArray[i][j];
            }
        }
        return sum;
    }
}