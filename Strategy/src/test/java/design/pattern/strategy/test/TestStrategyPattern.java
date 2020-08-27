package design.pattern.strategy.test;

import head.first.design.pattern.strategy.*;
import org.junit.Test;

/**
 * @author: WavyPeng
 * @date: 2020/8/28
 */
public class TestStrategyPattern {

    @Test
    public void MiniDuckSimulator() {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        // 通过setter方法改变鸭子行为
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
