package Java_core.java_core_lesson_5;

import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private Integer[][] data; //обертка
//Value 1;Value 2;Value 3
//100;200;123
//300,400,500


    public AppData(String[] header) {
        this.header = header;
    }

    public AppData() {

    }

    public String[] getHeader() {
        return header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    //метод сохранения данных в файл fileName
    public void save(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write(rowToString(header));//потоком вывода записываем в файл
            for (Integer[] row : data) { //итерируемся по массиву data
                writer.write(rowToString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // обобщенный метод, принимающий массивы разного типа
    private <T> String rowToString(T[] row) {
        // переменная, накапливающая результат
        String result = "";
        for (int i = 0; i < row.length; i++) {
            result = result + row[i].toString();
            if (i != row.length - 1) {
                result += ";";
            }
        }
        result += "\n";
        return result;
    }

    public void load(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            header = bufferedReader.readLine().split("i");
            ArrayList<Integer[]> dataList = new ArrayList<>();
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
                dataList.add(stringToDataRow(tempString));
            }
            data = dataList.toArray(new Integer[][]{{}});//выполняем преобразование к двумерному массиву инт
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private Integer[] stringToDataRow(String str) {
        String[] strings = str.split(";");
        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        return integers;
    }


}