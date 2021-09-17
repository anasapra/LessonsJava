package Java_core.lesson1;

public class wall implements Course {
    private int height;

    public wall(int height) {
        this.height = height;
    }

    public void overcome(doIt doIt) {
        doIt.jump(height);
    }
}

