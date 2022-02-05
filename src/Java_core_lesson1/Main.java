package Java_core_lesson1;
//перезаливка дз с прошлого потока
// почему-то при запуске выдает ошибку
// java: cannot find symbol
//  symbol:   variable jumpHeight
//  location: variable teams of type Java_core_lesson1.Team[]
import java.util.Arrays;
public class Main {
    public void main(String[] args) {
        Team[] teams = {new Man1(5, 25), new Man2(3, 31),
                new Man3(3, 31), new Man4(2, 28)};
        System.out.println(Arrays.toString(teams) + teams.jumpHeight + teams.runLength );
        Course[] c = {new Wall(4), new Distance(25)};
        for (Team team : teams) {
            for (Course Course : c) {
                Java_core_lesson1.Course.overcome(team);
            }
        }
    }
/*private static showResults(String)*/
}
