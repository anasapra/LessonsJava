import java.util.Arrays;

import static java.lang.Integer.sum;

public class lesson_3 {
    public static void main(String[] args) {
        System.out.println( "1 *********************************" );
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array1 = {1, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
        //    if (array[i] == 1) {
          //      array[i] = 0;
          //  } else {
         //       array[i] = 1;
         //   }
            array1[i] = ((array1[i] == 1) ? 0 : 1);
        }
        System.out.println(Arrays.toString(array1));

        System.out.println( "2 *********************************" );
        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] array2 = new int[100];
                for (int i = 0; i < 100; i++) {
            array2[i] = i + 1;
        }
        System.out.println(Arrays.toString(array2));

        System.out.println( "3 *********************************" );
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
       int[] array3 =  new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("  " + Arrays.toString(array3));
            for (int i = 0; i < array3.length; i++) {
                if (array3[i] < 6) {
                    array3[i] = array3[i] * 2;
                }
            }
                // if (array3[i] < 6)
                //    array3[i] *= 2;
                System.out.println(Arrays.toString(array3));

                System.out.println("4 *********************************");


//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];
        //int size = 4;
       // int[][] array4 = new int[size][size];
        int[][] array4 = new int[4][4];
        int lastIndex = array4.length - 1;
        for (int i = 0; i < array4.length; i++) {
            array4[i][i] = 1;
            array4[i][(lastIndex - i)] = 1;
            System.out.println(Arrays.toString(array4[i]));
        }

        System.out.println( "5 *********************************" );
        //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
// длиной len, каждая ячейка которого равна initialValue;
        int len = 7;
        int initialValue = 8;
        int[] array5 = initArray(len, initialValue);
        System.out.println(Arrays.toString(array5));

        //6.  Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        System.out.println( "6 *********************************" );
        System.out.println(Arrays.toString(array3));
        System.out.println("Min: " + findMin(array3));
        System.out.println("Max: " + findMax(array3));
//7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
//**Примеры:
//checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//
//граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
System.out.println( "7 *********************************" );
        int[] balance = {1, 1, 1, 1, 1, 1, 6};
        System.out.print("Is the " + Arrays.toString(balance) + " balanced? ");
        System.out.println(checkBalance(balance));
//8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.
        System.out.println( "8 *********************************" );
        int[] array8 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array8));
        shifter(array8, -3);
        System.out.println("shift >>> (-3) : " + Arrays.toString(array8));
        shifter(array8, 6);
        System.out.println("shift >>> (+6) : " + Arrays.toString(array8));
    }


    public static int[] initArray(int len, int initialValue) {
        int[] array5 = new int[len];

      //  for (int i = 0; i < array5.length; i++) {
     //       array5[i] = initialValue;
      //  }
Arrays.fill(array5, initialValue);
        return array5;
    }

    private static int findMin(int[] array3) {
        int min = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < min) {
                min = array3[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array3) {
        int max = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > max) {
                max = array3[i];
            }
        }
        return max;
    }

    private static void shifter(int[] array, int value) {
        boolean direction;
        if (value < 0) {
            direction = true;
            value = -value;
        } else {
            direction = false;
        }
        value %= array.length;
        int lastIndex = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? array[0] : array[lastIndex];
            for (int j = 0; j < lastIndex; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[lastIndex - j] = array[lastIndex - j - 1];
            }
            if (direction)
                array[lastIndex] = temp;
            else
                array[0] = temp;
        }
    }
    private static boolean checkBalance(int[] array) {
        int right = 0, left = 0;
        for (int i = 0; i < array.length - 1; i++) {
            left += array[i];
            for (int j = i + 1; j < array.length; j++)
                right += array[j];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }
   // private static boolean checkBalance1(int[] array8) {
    //    System.out.println();
     //   boolean result = false;
     //  int leftSum = 0;
      //  int rightSum = sum(array8,0, array8.length);
      //  for (int i =0; i < array8.length; i++) {
       //     leftSum += array8[i];
       //     rightSum -= array8[i];
       //     if (leftSum == rightSum) {
       //        System.out.println("Sum = " + leftSum + "; index = " + i);
      //      }
     //   }
   // }
}
