package head.first.design.pattern.strategy;

/**
 * @author: WavyPeng
 * @date: 2020/8/27
 */
public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("squeak");
    }
}
