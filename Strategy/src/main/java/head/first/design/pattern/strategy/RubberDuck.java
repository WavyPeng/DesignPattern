package head.first.design.pattern.strategy;

/**
 * @author: WavyPeng
 * @date: 2020/8/27
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duck!");
    }
}
