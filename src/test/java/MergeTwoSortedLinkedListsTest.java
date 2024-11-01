import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedLinkedListsTest {

    MergeTwoSortedLinkedLists ml = new MergeTwoSortedLinkedLists();

    @Test
    public void Test1() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(4);

        //LinkedList<Integer> output = ml.mergeTwoLists(list1, list2);

    }
}
