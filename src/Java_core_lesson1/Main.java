package Java_core_lesson1;
//package Java_core.lesson1;
//1. Разобраться с имеющимся кодом.
//        2. Добавить класс Team, который будет содержать:
//        название команды;
//        массив из четырех участников — в конструкторе можно сразу всех участников указывать);
//        метод для вывода информации о членах команды, прошедших дистанцию;
//        метод вывода информации обо всех членах команды.
//        3. Добавить класс Course (полоса препятствий), в котором будут находиться:
//        массив препятствий;
//        метод, который будет просить команду пройти всю полосу.
//        В итоге должно получиться похожее:
//public static void main(String[] args) {
//        Course c = new Course(...); // Создаем полосу препятствий
//        Team team = new Team(...); // Создаем команду
//        c.doIt(team); // Просим команду пройти полосу
//        team.showResults(); // Показываем результаты
//        }
import java.util.Arrays;
public class Main {
    public void main(String[] args) {
        Team[] teams = {new Man1(5, 25), new Man2(3, 31),
                new Man3(3, 31), new Man4(2, 28)};
        System.out.println(Arrays.toString(teams) + teams.jumpHeight + teams.runLength );
        Course[] c = {new Wall(4), new Distance(25)};
        for (Team team : teams) {
            for (Course Course : c) {
                Java_core_lesson1.Course.overcome(team);
            }
        }
    }
/*private static showResults(String)*/
}
