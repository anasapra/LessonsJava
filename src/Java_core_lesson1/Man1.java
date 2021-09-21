package Java_core_lesson1;

public class Man1 implements Team {
    private int jumpHeight;
    private int runLength;

    public Man1(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    int getJumpHeight() { return this.jumpHeight; }
    int getRunLength() { return this.runLength; }
   @Override
    public String toString() {
        return "TeamMember Man1";
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
