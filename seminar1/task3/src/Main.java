/* --------------------------------------------------------------------------
### Задача №3 ###
-----------------------------------------------------------------------------
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный
массив. Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только
с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке
может лежать только значение 0 или 1. Если нарушается одно из условий,
метод должен бросить RuntimeException с сообщением об ошибке.
-------------------------------------------------------------------------- */

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        int[][] array = new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {0, 0, 1}
        };
        System.out.println(this.sum2DArr(array));
    }

    public int sum2DArr(int[][] numArray) {
        int sum = 0;
        if (numArray.length == 0) {
            throw new RuntimeException("Двумерный массив пустой!");
        }
        if (numArray[0].length != numArray.length) {
            throw new RuntimeException("Двумерный массив не квадратный!");
        }
        for (int[] line: numArray) {
            for (int i = 0; i < numArray.length; i++) {
                if (line[i] != 0 && line[i] != 1) {
                    throw new RuntimeException("В массиве содержится число кроме 0, 1!");
                }
                sum += line[i];
            }
        }
        return sum;
    }
}