package pattern.design.command.invoker;

import pattern.design.command.commands.GoCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ykhdzr on 2/18/16.
 */
public class GoController {

    private GoCommand command;

    List<GoCommand> historyOrder;

    public GoController() {
        historyOrder = new ArrayList<>();
    }

    public void placeOrder(GoCommand command) {
        this.command = command;
        command.execute();
        historyOrder.add(command);
    }

    public List<GoCommand> getHistory() {
        return historyOrder;
    }
}
