package Java_core_lesson1_var4;

public class Team {
 //   String name;
   /* String[] members;

    public void showResults() {

    }
    public void showWinners() {

    }*/

    private TeamMember[] members;
    private final String nameTeam; //название не меняется, финалим
//в сигнатуре метода в описании параметров даем конечным параметром сигнатуру записи ...,
// т.о. на вход даем набор объектов класса Team member, и они будут объединены
// в массив members
    public Team(String nameTeam, TeamMember... members){
        this.members = members;//присваиваем к массиву
        this.nameTeam = nameTeam;
    }
    public void showResults() {
        printDivider();
        System.out.println("Полосу препятствий преодолевала команда" + nameTeam);
        for (TeamMember member: members) {
            if (member.getStatus() == Status.NoPassedDistance) //ссылка на объект, выбор из перечисления в enum//
                {
                showResultMemberNotPassed(member);}
            else {showResultMemberPassed(member);
            }
        }
        //в цикле перебираем всех участников команды
        printDivider();
    }
    private void showResultMemberNotPassed(TeamMember member){
        printDivider();
        System.out.println(member.getNameTeamMember() + "Не прошел полосу препятствий");
    }

    private void showResultMemberPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getNameTeamMember() + "Успешно прошел полосу препятствий");
    }
    public  TeamMember[] getMembers() {return members;}
    private void printDivider() { System.out.println("________________________________________");
    }
}
