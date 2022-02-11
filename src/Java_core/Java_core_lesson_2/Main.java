package Java_core.Java_core_lesson_2;

//        перезачет дз с прошлого потока
//        1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
//        При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//        2. Далее метод должен пройтись по всем элементам массива,
//        преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось
//        (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
//        с детализацией, в какой именно ячейке лежат неверные данные.
//        3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
//        MyArrayDataException и вывести результат расчета.

public class Main {
    public static int arraySum(String[][] twoDimentionalArray) throws MyArraySizeException {
        if (twoDimentionalArray.length != 4) {
            throw new MyArraySizeException("Длина1 массива не равна 4");
        }
        for (String[] array : twoDimentionalArray) {
            if (array.length != 4) {
                throw new MyArraySizeException("Длина2 массива не равна 4");
            }
        }
        int sum = 0;
        for (int i = 0; i < twoDimentionalArray.length; i++) {
            for (int j = 0; j < twoDimentionalArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(twoDimentionalArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArraySizeException("Не число в элементе: " + i + "," + j);
                }
            }
        }
            return sum;
        }

    public static void main (String[] args){
        String[][] correctArray =
                {{"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"}};
        try {
            System.out.println(arraySum(correctArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        String[][] inCorrectArray =
                {{"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1+", "2", "3", "4"},
                        {"1", "2", "3", "4"}};
        try {
            System.out.println(arraySum(inCorrectArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

}
