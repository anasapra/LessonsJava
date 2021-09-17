package Java_core.lesson1;

public class Man3 implements doIt {
    private int jumpHeight;
    private int runLength;

    public Man3(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Я спортсмен 3, я не перепрыгнул стену!");
        } else {
            System.out.println("Я спортсмен 3, я перепрыгнул стену!");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Я спортсмен3, я не смог пробежать!");
        } else {
            System.out.println("Я спортсмен3, я пробежал!");
        }
    }
}
