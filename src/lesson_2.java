//1. Написать метод, принимающий на вход два целых числа и проверяющий,
//что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//в противном случае – false.
//2. Написать метод, которому в качестве параметра передается целое число,
//метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//Замечание: ноль считаем положительным числом.
//3. Написать метод, которому в качестве параметра передается целое число.
//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//4. Написать метод, которому в качестве аргументов передается строка и число,
//метод должен отпечатать в консоль указанную строку, указанное количество раз;
//5.* Написать метод, который определяет, является ли год високосным,
//и возвращает boolean (високосный - true, не високосный - false).
//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

public class lesson_2 {
    public static void main (String[] args) {
        System.out.println( "1 *********************************" );
System.out.println("Check 10=<(a + b)<=20 = " + checkPositiveSum(5, 10));
        System.out.println( "2 *********************************" );
        printInt(0);
        System.out.println( "3 *********************************" );
        System.out.println(checkPositiveNum(2));
        System.out.println( "4 *********************************" );
printRepeatText( "Wait for friday!",  5);
        System.out.println( "5 *********************************" );
        System.out.println(checkLeapYear(2016));
    }
    private static boolean checkPositiveSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
}
public static void printInt(int number) {
        if (number >= 0) {
            System.out.println("Positive");
        }  else {
            System.out.println("Negative");
        }
}
public static boolean checkPositiveNum(int a) {
        return a < 0;
}
public static void printRepeatText(String text, int repeatText) {
      for (int i = 0; i < repeatText; i++ ) {
          System.out.println(text);
      }
}
public static boolean checkLeapYear(int year) {
        return(year % 4 == 0 && year % 100 != 0) || year % 400 ==0;
}
}