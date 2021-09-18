package Java_core_lesson1;

public class Wall implements Course {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(Team team) {
        team.jump(height);
    }
}

