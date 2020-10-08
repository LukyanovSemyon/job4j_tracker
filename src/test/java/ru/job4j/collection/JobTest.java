package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameRev() {
        Comparator<Job> cmpName = new JobDescByNameRev();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriority() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityReverse() {
        Comparator<Job> cmpPriority = new JobDescByPriorityRev();
        int rsl = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority
                = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityReverse() {
        Comparator<Job> cmpNamePriorityRev
                = new JobDescByNameRev().thenComparing(new JobDescByPriorityRev());
        int rsl = cmpNamePriorityRev.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName
                = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndNameReverse() {
        Comparator<Job> cmpPriorityNameRev
                = new JobDescByPriorityRev().thenComparing(new JobDescByNameRev());
        int rsl = cmpPriorityNameRev.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityReverseNamesAreSame() {
        Comparator<Job> cmpNamePriorityRev
                = new JobDescByNameRev().thenComparing(new JobDescByPriorityRev());
        int rsl = cmpNamePriorityRev.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndNamePrioritiesAreSame() {
        Comparator<Job> cmpPriorityName
                = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}