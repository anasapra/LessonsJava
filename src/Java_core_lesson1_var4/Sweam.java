package Java_core_lesson1_var4;

public class Sweam extends Obstacle {
    public Sweam(int difficulty) { super(difficulty);}
    @Override
    public void goChallenge(TeamMember member) {member.swimm(5);}
}
