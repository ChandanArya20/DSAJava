public class DLLMain {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
//        list.insert(12);
//        list.insert(23);
//        list.insert(80);

//        list.print();
//        System.out.println("Before length : "+list.getLength());
//        list.remove(12);
//        list.print();
//        System.out.println("After removing : "+list.getLength());


        list.insertAtFirst(23);
        list.insertAtFirst(40);
        list.insertAtFirst(9);

        list.insertAtLast(90);
        list.insertAtLast(10);

        list.print();



//        list.removeFirst();
//        list.removeLast();

        System.out.println(list.get(3));
        System.out.println(list.search(23));
//
        list.insertAtIndex(3, 11);


        list.print();
        System.out.println("Length: "+list.getLength());





    }
}
