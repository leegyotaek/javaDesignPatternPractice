package decorator.mydecorator;

public class ComboDecorator extends AttackDecorator {

    public ComboDecorator(Attack decoratedAttack) {
        super(decoratedAttack);
    }

    public void attack(){
        super.attack();
        comboAttack();
    }

    private void comboAttack(){
        System.out.println("do Attack");
    }

}
