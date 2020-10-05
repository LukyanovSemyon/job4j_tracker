package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select:");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = null;
            for (int index = 0; index < actions.size(); index++) {
                if (index == select) {
                    action = actions.get(index);
                }
            }
            assert action != null;
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            UserAction value = actions.get(index);
            out.println(index + ". " + value.name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Input input = new ValidateInput(output, new ConsoleInput());
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new CreateAction(output));
        actions.add(new ShowAction(output));
        actions.add(new EditAction(output));
        actions.add(new DeleteAction(output));
        actions.add(new FindByIdAction(output));
        actions.add(new FindByNameAction(output));
        actions.add(new ExitAction(output));
        new StartUI(output).init(input, tracker, actions);
    }
}
