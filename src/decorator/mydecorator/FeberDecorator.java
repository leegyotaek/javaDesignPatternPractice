package decorator.mydecorator;

public class FeberDecorator extends AttackDecorator {

    public FeberDecorator(Attack decoratedAttack) {
        super(decoratedAttack);
    }

    public void attack(){
        super.attack();
        feberAttack();
    }

    private void feberAttack() {
        System.out.println("do feber attack");
    }
}
