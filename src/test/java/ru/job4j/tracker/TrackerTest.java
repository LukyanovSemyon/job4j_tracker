//package ru.job4j.tracker;
//
//import org.junit.Test;
//import static org.hamcrest.Matchers.is;
//import static org.hamcrest.core.IsNull.nullValue;
//import static org.junit.Assert.*;
//
//public class TrackerTest {
//    @Test
//    public void whenAddNewItemThenTrackerHasSameItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item();
//        item.setName("test1");
//        tracker.add(item);
//        Item result = tracker.findById(item.getId());
//        assertThat(result.getName(), is(item.getName()));
//    }
//
////    @Test
////    public void whenReplace() {
////        Tracker tracker = new Tracker();
////        Item bug = new Item();
////        bug.setName("Bug");
////        tracker.add(bug);
////        int id = bug.getId();
////        Item bugWithDesc = new Item();
////        bugWithDesc.setName("Bug with description");
////        tracker.replace(id, bugWithDesc);
////        assertThat(tracker.findById(id).getName(), is("Bug with description"));
////    }
////
////    @Test
////    public void whenDelete() {
////        Tracker tracker = new Tracker();
////        Item bug = new Item();
////        bug.setName("Bug");
////        tracker.add(bug);
////        int id = bug.getId();
////        tracker.delete(id);
////        assertThat(tracker.findById(id), is(nullValue()));
////    }
//
//    @Test
//    public void s1() {
//        Tracker t = TrackerSingle1.INSTANCE.getTracker();
//        Tracker t2 = TrackerSingle1.INSTANCE.getTracker();
//        assertSame(t, t2);
//    }
//
//    @Test
//    public void s2() {
//        Tracker t = TrackerSingle2.getInstance();
//        Tracker t2 = TrackerSingle2.getInstance();
//        assertSame(t, t2);
//    }
//
//    @Test
//    public void s3() {
//        Tracker t = TrackerSingle3.getInstance();
//        Tracker t2 = TrackerSingle3.getInstance();
//        assertSame(t, t2);
//    }
//
//    @Test
//    public void s4() {
//        Tracker t = TrackerSingle4.getInstance();
//        Tracker t2 = TrackerSingle4.getInstance();
//        assertSame(t, t2);
//    }
//}