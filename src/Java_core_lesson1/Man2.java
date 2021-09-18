package Java_core_lesson1;

public class Man2 implements Team {
    private int jumpHeight;
    private int runLength;

    public Man2(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Я спортсмен 2, я не перепрыгнул стену!");
        } else {
            System.out.println("Я спортсмен 2, я перепрыгнул стену!");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Я спортсмен2, я не смог пробежать!");
        } else {
            System.out.println("Я спортсмен2, я пробежал!");
        }
    }
}
