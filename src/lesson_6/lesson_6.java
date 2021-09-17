/*Урок 6. Продвинутое ООП
        1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.*/

package lesson_6;
import java.util.Random;
public class lesson_6 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 200, 1);
        Cat cat2 = new Cat("Мурзик", 200,  1);
        Dog dog1 = new Dog("Тузик", 500, 10);
        Dog dog2 = new Dog("Бобик", 500, 10);


        Animal[] allAnimals = {cat1, cat2, dog1, dog2};


        String tempWinEvent = " это получилось";
        String tempLossEvent = " это не получилось";
        String eventName;
        String eventResult;

  Random random = new Random();

        int runLength = random.nextInt(500);
        int swimLength = random.nextInt(10);




        for (int i = 0; i < allAnimals.length; i++) {
        String nameString = allAnimals[i].getType() + " " + allAnimals[i].getName() + " может ";

        eventName = "пробежать на " + allAnimals[i].getMaxRun() + " м. Пытается пробежать на ";
        eventResult = allAnimals[i].run(runLength) ? tempWinEvent : tempLossEvent;
        result(nameString, eventName, runLength, eventResult);

        int swimResult = allAnimals[i].swim(swimLength);
        eventName = "проплыть на " + allAnimals[i].getMaxSwim() + " м. Попытка проплыть на ";
        eventResult = (swimResult == Animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

        if (swimResult == Animal.SWIM_NONE)
            eventResult = " это не получилось, т.к. кот не умеет плавать";
        result(nameString, eventName, swimLength, eventResult);
    }
        System.out.println("Общее количество животных = " + Animal.countAnimal + ", кошек = " + Cat.countCat + ", собак = " + Dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);
    }

}