package decorator.mydecorator;

public class main {
    public static void main(String[] args){

        Attack basicAttack = new BasicAttack();
        basicAttack.attack();

        Attack comboAttack = new ComboDecorator(basicAttack);
        comboAttack.attack();

        Attack feberAttack = new FeberDecorator(basicAttack);
        feberAttack.attack();

        Attack febarAndComboAttack = new FeberDecorator(new ComboDecorator(new BasicAttack()));
        febarAndComboAttack.attack();

    }
}
