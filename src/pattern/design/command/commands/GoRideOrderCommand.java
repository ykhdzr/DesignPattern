package pattern.design.command.commands;

import pattern.design.command.receiver.GoRide;

/**
 * Created by ykhdzr on 2/18/16.
 */
public class GoRideOrderCommand implements GoCommand {

    private GoRide goRide;

    public GoRideOrderCommand(GoRide goRide) {
        this.goRide = goRide;
    }

    @Override
    public void execute() {
        goRide.orderDriver();
    }

    @Override
    public String toString() {
        return "You order GoRide service";
    }
}
