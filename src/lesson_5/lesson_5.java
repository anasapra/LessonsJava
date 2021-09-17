package lesson_5;

/*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        Конструктор класса должен заполнять эти поля при создании объекта.
        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        Создать массив из 5 сотрудников.
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);
*/
public class lesson_5 {

    public static void main(String[] args) {
        Person mainEmployee = new Person("Анна", "Михална",
                "Амсова", "8(800)000-00-01",
                "junior developer", 70000, 1992);

        Person[] office = {
                mainEmployee,
                new Person("Иван", "Иванович",
                        "Иванов", "8(800)000-00-20",
                        "project owner", 250000, 1973),
                new Person("Илон", "Эролович",
                        "Маск", "8(800)000-00-02",
                        "senior developer", 180000, 1971),
                new Person("Гадя", "Петрович",
                        "Хренова", "8(800)000-55-00",
                        "senior developer", 200000, 1990),
                new Person("Алла", "Борисовна",
                        "Пугачова", "8(800)320-00-00",
                        "junior developer", 65000, 1949)
        };

        getAllPersonsInOffice(office);
        System.out.println("*****************************************************************************");

        getFortyPlusPerson(office, 40);

    }

    private static void getFortyPlusPerson(Person[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println((i+1) + " " + office[i].getFullInfo());
            }
    }

    private static void getAllPersonsInOffice(Person[] office) {
        System.out.println("All person: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }
    public static class Person {

        private static int CURRENT_YEAR = 2021;

        private String surname;
        private String secondName;
        private String name;
        private String position;
        private String phone;
        private int salary;
        private int birthYear;

        // 2.	Конструктор класса
        public Person(String name,
                      String secondName,
                      String surname,
                      String phone,
                      String position,
                      int salary,
                      int birthYear) {
            this.birthYear = birthYear;
            this.name = name;
            this.surname = surname;
            this.secondName = secondName;
            this.position = position;
            this.phone = phone;
            this.salary = salary;
        }

        int getAge() {
            return CURRENT_YEAR - birthYear;
        }

        int getSalary() {
            return salary;
        }

        String getSecondName() {
            return secondName;
        }

        String getName() {
            return name;
        }

        String getSurname() {
            return surname;
        }

        String getPosition() {
            return position;
        }

        String getPhone() {
            return phone;
        }

        String getFullInfo() {
            return this.name + " " +
                    this.secondName + " " +
                    this.surname + ", " +
                    this.getAge() + " years old, " +
                    this.position + ". Phone number: " +
                    this.phone + ". Salary is " +
                    this.getSalary() + " RU";
        }

    }
}



