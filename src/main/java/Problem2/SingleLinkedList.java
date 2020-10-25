package Problem2;
/*
    Nam Nguyen
    October 24, 2020
    CSS 143B
    Homework_3

    Sources:
    Professor's Du Saturday(10/24/20) lecture. (Copy Constructor)
 */

// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        // homework
        if(list == null){
            return;
        }

        ListNode ptr1 = new ListNode();
        head = ptr1;
        ListNode ptr2 = list.head.next;

        while(ptr2 != null){
            ptr1.next = new ListNode(ptr2.val);
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        size = list.size;
    }

    public int removeAll(int valueToRemove) {
        // homework
        // in-place
        int count = 0;
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        if(ptr1.next == null){
            return 0;
        }

        while(ptr2 != null){
            Integer current = ptr2.val;

            if(current == valueToRemove){
                ptr1.next = ptr2.next;
                size--;
                count++;
            }

            if(ptr2.next != null && current != valueToRemove) {
                ptr1 = ptr2;
                ptr2 = ptr2.next;
            } else if(current == valueToRemove){
                ptr2 = ptr2.next;
            } else {
                ptr2 = null;
            }
        }

        return count;
    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        // homework
        // in-place
    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
