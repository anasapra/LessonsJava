package Java_core.java_core_lesson_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*1. Реализовать сохранение данных в csv файл;
2. Реализовать загрузку данных из csv файла. Файл читается целиком.
Структура csv файла:
| Строка заголовок с набором столбцов |
| Набор строк с целочисленными значениями |
| * Разделитель между столбцами - символ точка с запятой (;) |
Для хранения данных использовать класс вида:
public class AppData {
  private String[] header;
  private int[][] data;*/
        AppData appData = new AppData();
        appData.load("hw5.txt");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));//печать двумерного массива
        appData.save("hw5-1.txt");
    }
}
