package Java_core.lesson1;

public class distance implements Course {
    private int length;

    public distance(int length) {
        this.length = length;
    }
    public void overcome(doIt doIt) {
        doIt.run(length);
    }
}
