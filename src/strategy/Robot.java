package strategy;

public abstract class Robot {

    public Robot(String name) {
        this.name = name;
    }

    private String name;

    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    public String getName() {
        return name;
    }

    protected void move(){movingStrategy.move();}
    protected void attack(){attackStrategy.attack();}

    public void setAttackStrategy(AttackStrategy attackStrategy) {this.attackStrategy = attackStrategy;}
    public void setMovingStrategy(MovingStrategy movingStrategy) {this.movingStrategy = movingStrategy;}


}
