package head.first.design.pattern.strategy;

/**
 * @author: WavyPeng
 * @date: 2020/8/27
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I can fly with a rocket!");
    }
}
