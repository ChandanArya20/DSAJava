public class CLLMain {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insertAtFirst(12);
        list.insertAtFirst(32);
        list.insertAtFirst(92);

        list.insertAtLast(20);
        list.insertAtLast(22);
        list.insertAtLast(24);


        list.print();
        System.out.println("Length: "+list.getLength());

    }
}
