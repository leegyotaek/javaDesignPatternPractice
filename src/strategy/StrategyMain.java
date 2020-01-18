package strategy;

public class StrategyMain {

    public static void main(String[] args) {

        System.out.println("hello");

        Robot atom = new Atom("atom");
        atom.setAttackStrategy(new PunchStrategy());
        atom.setMovingStrategy(new FlyingStrategy());

        Robot taekwonV = new TakewonV("taekwonV");
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());

        atom.attack();
        atom.move();

        taekwonV.attack();
        taekwonV.move();


    }


}
