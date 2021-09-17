package Java_core.lesson1;

public class Man4 implements doIt {
    private int jumpHeight;
    private int runLength;

    public Man4(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }
    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Я спортсмен 4, я не перепрыгнул стену!");
        } else {
            System.out.println("Я спортсмен 4, я перепрыгнул стену!");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Я спортсмен4, я не смог пробежать!");
        } else {
            System.out.println("Я спортсмен4, я пробежал!");
        }
    }
}
