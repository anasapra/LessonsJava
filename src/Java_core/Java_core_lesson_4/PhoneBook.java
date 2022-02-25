package Java_core.Java_core_lesson_4;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>()); //если фамилия уже есть, массив из номеров
        phonesForLastName.add(phoneNumber); //добавляем к фамилии еще номер
        phoneBook.put(lastName, phonesForLastName);
    }
    public ArrayList<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(); //экземпляр класса
        phoneBook.add("Зуев", "123456");
        phoneBook.add("Зуев1", "1223456");
        phoneBook.add("Зуев2", "12345677");
        phoneBook.add("Зуев", "33333666");

        System.out.println(phoneBook.get("Зуев"));
    }
}
