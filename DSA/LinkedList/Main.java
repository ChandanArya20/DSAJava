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


        list.insertAtFirst(23);
        list.insertAtFirst(40);
        list.insertAtFirst(9);

        list.insertAtLast(90);
        list.insertAtLast(10);

        list.print();



//        list.removeFirst();
        list.removeLast();

        list.print();
        System.out.println("Length: "+list.getLength());





    }
}
