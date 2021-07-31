package lesson_6;
import java.util.Random;

public abstract class Animal {
    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    public static int countAnimal = 0;

    private String type;
    protected String name;
    protected int maxRun;
    protected int maxSwim;
/* protected для доступа через дочерние классы, а не через сеттеры*/
/*    static Random random = new Random();
    /* параметризированный конструктор для инициализации полей*/

    Animal(String type, String name, int maxRun, int maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        countAnimal++;
    }


    String getName() { return this.name; }

    String getType() {
        return this.type;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    protected int swim(float distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL;
    }

   /* public void printInfo() {
        System.out.println(this);
    }
     this.getClass().getSimpleName() объявляем в родительском классе и не переопределяем в дочерних

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
            "maxRunDistance" + maxRun + ", maxSwimDistance" + maxSwim +  "}";
    }*/
}
