package strategy;

public class MissileStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I can launch missles");
    }
}
