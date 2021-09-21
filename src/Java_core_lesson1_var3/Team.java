package Java_core_lesson1_var3;
//2. Добавить класс Team, который будет содержать:
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
public class Team {
    private String male;
    private String name;
    private float maxRun;
    private float maxSwim;
    public static int countTeamMember = 0;
    Team(String male, String name, float maxRun, float maxSwim) {
        this.male = male;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        ++countTeamMember;
    }

    String getName() {
        return this.name;
    }

    String getType() {
        return this.male;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    protected boolean swim(float distance) {
        return (distance <= maxSwim);
    }

}