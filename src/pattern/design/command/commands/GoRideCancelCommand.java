package pattern.design.command.commands;

import pattern.design.command.receiver.GoRide;

/**
 * Created by ykhdzr on 2/18/16.
 */
public class GoRideCancelCommand implements GoCommand {

    private GoRide goRide;

    public GoRideCancelCommand(GoRide goRide) {
        this.goRide = goRide;
    }

    @Override
    public void execute() {
        goRide.cancelOrder();
    }

    @Override
    public String toString() {
        return "You cancel GoRide service";
    }
}
