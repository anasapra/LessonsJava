package lesson_6;

public class Cat extends Animal{

   /* public static final int DEFAULT_MAX_RUN = 200;
    public static final int DEFAULT_MAX_SWIM = 1;
*/
    public static int countCat = 0;
    private static String type = "Кот";

    public Cat(String name, int maxRun, int maxSwim) {
        super(type, name, maxRun, maxSwim);
        ++countCat;
    }
    @Override
    public int swim(float distance) {
        return Animal.SWIM_NONE;
    }

   /* public Cat(String type, String name, int maxRun, int maxSwim) {
        this(DEFAULT_MAX_RUN, DEFAULT_MAX_SWIM);
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRun >= distance) {
            System.out.printf("Кошка пробежала дистанцию", distance, maxRun);
            return true;
        }
        @Override
                System.out.println("Кошка не умеет плавать");
        return false;
    }
*/
}