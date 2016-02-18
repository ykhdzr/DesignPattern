package pattern.design.command.commands;

import pattern.design.command.receiver.GoFood;

/**
 * Created by ykhdzr on 2/18/16.
 */
public class GoFoodOrderCommand implements GoCommand {

    private GoFood goFood;

    public GoFoodOrderCommand(GoFood goFood) {
        this.goFood = goFood;
    }

    @Override
    public void execute() {
        goFood.orderFood();
    }

    @Override
    public String toString() {
        return "You order GoFood service";
    }
}
