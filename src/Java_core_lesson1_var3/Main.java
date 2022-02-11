package Java_core_lesson1_var3;
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
public class Main {

    public static void main(String[] args) {
        Course c = new Course("run 100 m", "swim 50m", "cycle 3km"); // Создаем препятствия вариант1
        Course[] c2 = {new Course(100), new Course(30), new Course(70)}; // Создаем препятствия вариант2
        // Какой вариант создания массива предпочтительнее?

        Team team1 = new Team("Winners", "Ivan", "Petr", "Alex", "Lena"); // Создаем команду
        Team team2 = new Team("Losers", "Anton", "Kate", "Anna", "Diana"); // Создаем команду

        team1.showInfo(); // инфо о всех участниках через метод
        System.out.println(team2); // инфо о всех через переопределенный toString

        c.doIt(team1);

        for (int i = 0; i < c2.length; i++) { // бегут по препятс
            team1.run(c2[i].getLength());
            team2.run(c2[i].getLength());
        }

        team1.showResults(); // показываем результаты
    }

}