package Java_core_lesson1;

public class Distance implements Course {
    private int length;

    public Distance(int length) {
        this.length = length;
    }
    public void overcome(Team team) {
        team.run(length);
    }
}
