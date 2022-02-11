package Java_core_lesson_3;

public abstract class Fruit {
    private  int amount;
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
