package Java_core_lesson1;

public class Distance implements Course {
    protected int length;

    public Distance(int length) {
        this.length = length;
    }
    public void overcome(Team team) {
        team.run(length);
    }

}
//перезаливка дз с прошлого потока