package Java_core_lesson1_var3;

public class Course {
    private int length;

    private String[] arrCourse = new String[4];
    private String run;
    private String swim;
    private String cycle;

    public Course (int length) {
        this.length = length;
    }

    public Course(String run, String swim, String cycle) {
        this.arrCourse[0] = run;
        this.arrCourse[1] = cycle;
        this.arrCourse[2] = swim;
    }

    public int getLength() {
        return length;
    }

    void doIt(Team team) {
        System.out.println("Team '" + team.getTitle() + "', Please do it");
    }
}
