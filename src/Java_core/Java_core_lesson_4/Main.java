package Java_core.Java_core_lesson_4;
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
// из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
//2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
// номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
// (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
//Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие
// с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = { "Gouache", "Acrylic", "Watercolor", "Oil", "Pastel", "Pencil", "Charcoal", "Marker", "Pen", "Pen", "Crayon"};
        HashMap<String, Integer> uniqueWords = new HashMap<>(); //
        for (int i = 0; i < words.length; i++) {
            if (uniqueWords.containsKey(words[i])) {
                uniqueWords.put(words[i], uniqueWords.get(words[i])+1); //перебираем массив words, есть ли в HashMap ключ "Gouache", если да, ++
            } else {
                uniqueWords.put(words[i],1);
            }
        }
        System.out.println(uniqueWords);
    }
}
