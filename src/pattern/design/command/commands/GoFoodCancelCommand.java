package pattern.design.command.commands;

import pattern.design.command.receiver.GoFood;

/**
 * Created by ykhdzr on 2/18/16.
 */
public class GoFoodCancelCommand implements GoCommand {

    private GoFood goFood;

    public GoFoodCancelCommand(GoFood goFood) {
        this.goFood = goFood;
    }

    @Override
    public void execute() {
        goFood.cancelOrder();
    }

    @Override
    public String toString() {
        return "You cancel GoFood service";
    }
}
