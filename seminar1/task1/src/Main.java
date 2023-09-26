/* --------------------------------------------------------------------------
### Задача №1 ###
-----------------------------------------------------------------------------
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
в качестве кода ошибки, иначе - длину массива.
-------------------------------------------------------------------------- */

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        int[] array = new int[]{3, 2, 4, 5, 11, 7, 1};
        System.out.println(this.checkArrLen(array));
    }

    public int checkArrLen(int[] numArray) {
        return this.checkArrLen(numArray, 2);
    }

    public int checkArrLen(int[] numArray, int minLength) {
        if (numArray.length >= minLength) {
            return numArray.length;
        }
        return -1;
    }
}