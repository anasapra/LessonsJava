// Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
// Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple. Orange Banana Apple
// Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
// Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
// в противном случае - “Сумма отрицательная”;
// Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
// Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
// если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
// если больше 100 (100 исключительно) - “Зеленый”;
// Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
// Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
//
public class lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("*********************************");
        checkSumSign(-20, 10);
        System.out.println("*********************************");
        System.out.println(printColor(200));
        System.out.println("*********************************");
        System.out.println(compareNumbers(20, 30));

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Sum positive");
        } else {
            System.out.println("Sum negative");
        }
    }

    public static String printColor(int value) {
        if (value <= 0) {
            return "Red";
        } else if (value > 0 && value <= 100) {
            return "Yellow";
        } else {
            return "Green";
        }

    }

    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }

    }
}
