package lesson_6;

public class Dog extends Animal {

  // public static final int maxRun = 500;
  // public static final int maxSwim = 10;

    public static int countDog = 0;
    private static String type = "Собака";

    Dog(String name, int maxRun, int maxSwim) {
        super(type, name, maxRun, maxSwim);
        ++countDog;
    }

    // @Override
    // public boolean run(int runLength) {
    //     if (this.maxRun >= runLength) {
    //         System.out.printf("Собака пробежала дистанцию", runLength, maxRun);
    //         return true;
    //     }
    //     System.out.printf("Собака не смогла пробежать дистанцию", runLength, maxRun);
    //     return false;
    // }
    // @Override
    // public boolean swim(int swimLength) {
    //     if (this.maxRun >= swimLength) {
    //         System.out.printf("Собака проплыла дистанцию", swimLength, maxSwim);
    //         return true;
    //     }
    //     System.out.printf("Собака не смогла проплыть дистанцию", swimLength, maxSwim);
    //     return false;
    // }

}


