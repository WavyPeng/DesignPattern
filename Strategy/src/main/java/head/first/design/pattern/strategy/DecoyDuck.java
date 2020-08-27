package head.first.design.pattern.strategy;

/**
 * @author: WavyPeng
 * @date: 2020/8/27
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
