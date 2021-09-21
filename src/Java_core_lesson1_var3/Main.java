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

        String tempWinEvent = " это получилось";
        String tempLossEvent = " это не получилось";
        String eventName;
        String eventResult;
Team teamMember1 = new Team("woman", "Anna", 100, 25);
Team teamMember2 = new Team("woman", "Yana", 105, 28);
Team teamMember3 = new Team("men", "Andrey", 150, 50);
Team teamMember4 = new Team("men", "Ivan", 150, 50);

Team[] teams = {teamMember1, teamMember2, teamMember3, teamMember4};

        float runLength = 250;
        float swimLength = 10;

        for (int i = 0; i < teams.length; i++) {
            String nameString = teams[i].getType() + " " + teams[i].getName() + " может ";

            eventName = "пробежать на " + teams[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = teams[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            boolean swimResult = teams[i].swim(swimLength);
            eventName = "проплыть на " + teams[i].getMaxSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == Team.SWIM_OK) ? tempWinEvent : tempLossEvent;

            result(nameString, eventName, swimLength, eventResult);

        }
        System.out.println("All TeamMembers = " + Team.countTeamMember);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);
    }

}
