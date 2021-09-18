package Java_core_lesson1;

public class Man1 implements Team {
    private int jumpHeight;
    private int runLength;

    public Man1(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Я спортсмен 1, я не перепрыгнул стену!");
        } else {
            System.out.println("Я спортсмен 1, я перепрыгнул стену!");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Я спортсмен 1, я не смог пробежать!");
        } else {
            System.out.println("Я спортсмен 1, я пробежал!");
        }
    }

}
