package Java_core.Java_core_lesson_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();

    public Box() { //пустой конструктор
    }

    public ArrayList<T> getFruitList() {

        return fruitList;
    }

    public void setFruitList(ArrayList<T> fruitList) {

        this.fruitList = fruitList;
    }

    public void addFruit(T fruit) {

        fruitList.add(fruit);
    }

    public float getWeight() {

        return fruitList.size() * fruitList.get(0).getWeight();
    }

    public void pourOver(Box<T> box) {
        box.getFruitList().addAll(fruitList); //пересыпаем все фрукты одного типа в параметризированную коробку
        fruitList.clear(); // очищаем коробку
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + fruitList +
                '}';
    }

    public boolean compare(Box<?> box) {

        return Math.abs(getWeight() - box.getWeight()) < 0.001;
    }
//    public boolean compare(Box box) {
//        return this.getWeight() == box.getWeight();
//    }


}
