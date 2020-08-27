package head.first.design.pattern.strategy;

/**
 * @author: WavyPeng
 * @date: 2020/8/27
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck!");
    }
}
