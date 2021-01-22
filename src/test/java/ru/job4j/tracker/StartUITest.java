//package ru.job4j.tracker;
//
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.hamcrest.core.Is.is;
//import static org.hamcrest.core.IsNull.nullValue;
//import static org.junit.Assert.*;
//
//public class StartUITest {
//    @Test
//    public void whenCreateItem() {
//        Output output = new ConsoleOutput();
//        Input in = new StubInput(
//                new String[] {"0", "Item name", "1"}
//        );
//        Tracker tracker = new Tracker();
//        List<UserAction> actions = new ArrayList<UserAction>();
//        actions.add(new CreateAction(output));
//        actions.add(new ExitAction(output));
//        new StartUI(output).init(in, tracker, actions);
//        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
//    }
//
////    @Test
////    public void whenReplaceItem() {
////        Output output = new ConsoleOutput();
////        Tracker tracker = new Tracker();
////        List<Item> item = tracker.add(new Item("Replaced item"));
////        String replacedName = "New item name";
////        Input in = new StubInput(
////                new String[] {"0", String.valueOf(item.indexOfName), replacedName, "1"}
////        );
////        List<UserAction> actions = new ArrayList<UserAction>();
////        actions.add(new EditAction(output));
////        actions.add(new ExitAction(output));
////        new StartUI(output).init(in, tracker, actions);
////        assertThat(tracker.findById(id).getName(), is(replacedName));
////    }
////
////    @Test
////    public void whenDeleteItem() {
////        Output output = new ConsoleOutput();
////        Tracker tracker = new Tracker();
////        List<Item> item = tracker.add(new Item("Deleted item"));
////        Input in = new StubInput(
////                new String[] {"0", String.valueOf(item.getId()), "1"}
////        );
////        List<UserAction> actions = new ArrayList<UserAction>();
////        actions.add(new DeleteAction(output));
////        actions.add(new ExitAction(output));
////        new StartUI(output).init(in, tracker, actions);
////        assertThat(tracker.findById(item.getId()), is(nullValue()));
////    }
//
//    @Test
//    public void whenFindAllItem() {
//        Output output = new StubOutput();
//        Tracker tracker = new Tracker();
//        List<Item> item = tracker.add(new Item("first"));
//        Input in = new StubInput(
//                new String[] {"0", "1"}
//        );
//        List<UserAction> actions = new ArrayList<UserAction>();
//        actions.add(new ShowAction(output));
//        actions.add(new ExitAction(output));
//        new StartUI(output).init(in, tracker, actions);
//        assertThat(output.toString(), is("Menu." + System.lineSeparator()
//                + "0. === Show all items ===" + System.lineSeparator()
//                + "1. === Exit Program ===" + System.lineSeparator()
//                + "=== Show all items ===" + System.lineSeparator()
//                + "[Item{id=1, name='first'}]" + System.lineSeparator()
//                + "Menu." + System.lineSeparator()
//                + "0. === Show all items ===" + System.lineSeparator()
//                + "1. === Exit Program ===" + System.lineSeparator()
//                + "=== Exit Program ===" + System.lineSeparator()));
//    }
//
//    @Test
//    public void whenFindByNameItem() {
//        Output output = new StubOutput();
//        Tracker tracker = new Tracker();
//        List<Item> item = tracker.add(new Item("first"));
//        Input in = new StubInput(
//                new String[] {"0", "first", "1"}
//        );
//        List<UserAction> actions = new ArrayList<UserAction>();
//        actions.add(new FindByNameAction(output));
//        actions.add(new ExitAction(output));
//        new StartUI(output).init(in, tracker, actions);
//        assertThat(output.toString(), is("Menu." + System.lineSeparator()
//                + "0. === Find items by name ===" + System.lineSeparator()
//                + "1. === Exit Program ===" + System.lineSeparator()
//                + "=== Find items by name ===" + System.lineSeparator()
//                + "[Item{id=1, name='first'}]" + System.lineSeparator()
//                + "Menu." + System.lineSeparator()
//                + "0. === Find items by name ===" + System.lineSeparator()
//                + "1. === Exit Program ===" + System.lineSeparator()
//                + "=== Exit Program ===" + System.lineSeparator()));
//    }
//
//    @Test
//    public void whenFindByIDItem() {
//        Output output = new StubOutput();
//        Tracker tracker = new Tracker();
//        List<Item> item = tracker.add(new Item("first"));
//        Input in = new StubInput(
//                new String[] {"0", "1", "1"}
//        );
//        List<UserAction> actions = new ArrayList<UserAction>();
//        actions.add(new FindByIdAction(output));
//        actions.add(new ExitAction(output));
//        new StartUI(output).init(in, tracker, actions);
//        assertThat(output.toString(), is("Menu." + System.lineSeparator()
//                + "0. === Find item by Id ===" + System.lineSeparator()
//                + "1. === Exit Program ===" + System.lineSeparator()
//                + "=== Find item by Id ===" + System.lineSeparator()
//                + "Item{id=1, name='first'}" + System.lineSeparator()
//                + "Menu." + System.lineSeparator()
//                + "0. === Find item by Id ===" + System.lineSeparator()
//                + "1. === Exit Program ===" + System.lineSeparator()
//                + "=== Exit Program ===" + System.lineSeparator()));
//    }
//
//    @Test
//    public void whenInvalidExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"1", "0"}
//        );
//        Tracker tracker = new Tracker();
//        List<UserAction> actions = new ArrayList<UserAction>();
//        actions.add(new ExitAction(out));
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is(
//                String.format(
//                        "Menu.%n"
//                                + "0. === Exit Program ===%n"
//                                + "Wrong input, you can select: 0 .. 0%n"
//                                + "Menu.%n"
//                                + "0. === Exit Program ===%n"
//                                + "=== Exit Program ===%n"
//                )
//        ));
//    }
//}
