import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.insert(12);
//        list.insert(23);
//        list.insert(80);

//        list.print();
//        System.out.println("Before length : "+list.getLength());
//        list.remove(12);
//        list.print();
//        System.out.println("After removing : "+list.getLength());


//        list.insertAtFirst(23);
//        list.insertAtFirst(40);
//        list.insertAtFirst(9);
//
//        list.insertAtLast(90);
//        list.insertAtLast(10);
//
//        list.print();



//        list.removeFirst();
//        list.removeLast();

//        System.out.println(list.get(3));
//        System.out.println(list.search(100));
//
//        list.insertAtIndex(3, 11);

//        list.insertAtLastRec(10);
//        list.insertAtLastRec(10);
//        list.insertAtLastRec(12);
//        list.insertAtLastRec(28);
//        list.insertAtLastRec(40);
//        list.insertAtLastRec(40);
//        list.insertAtLastRec(40);

//        list.insertAtAfterRec(90, 2);
        list.print();

//        list.removeDuplicates();

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insertAtLast(3);
        list1.insertAtLast(10);
        list1.insertAtLast(19);
        list1.insertAtLast(32);
        list1.insertAtLast(32);

        list2.insertAtLast(5);
        list2.insertAtLast(10);
        list2.insertAtLast(15);
        list2.insertAtLast(22);
        list2.insertAtLast(40);

        LinkedList mergedList = LinkedList.merge(list1, list2);
        mergedList.print();


//        list.print();
//        System.out.println("Length: "+list.getLength());





    }
}
