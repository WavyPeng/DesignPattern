package head.first.design.pattern.strategy;

/**
 * @author: WavyPeng
 * @date: 2020/8/27
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a mallard duck!");
    }
}
