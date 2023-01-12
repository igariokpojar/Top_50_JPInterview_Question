
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();

        list.descendingIterator().forEachRemaining(list1::add);

        System.out.println(list1);
    }
}
/*
LinkedList descendingIterator() returns an iterator that iterates over the element in reverse order.
 The following example code shows how to use this iterator to create a new Linked List with elements listed in the reverse order:
 */