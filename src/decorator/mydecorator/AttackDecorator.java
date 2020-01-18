package decorator.mydecorator;

public class AttackDecorator extends Attack {

    private Attack decoratedAttack;

    public AttackDecorator(Attack decoratedAttack) {
        this.decoratedAttack = decoratedAttack;
    }

    @Override
    public void attack() {
        decoratedAttack.attack();
    }
}
