public class CircularLinkedList {

    private Node head;
    private Node tail;

    public void insertAtFirst(int value){

        if(head==null){
            head=tail=new Node(value);
            tail.next=head;
            return;
        }
        Node node = new Node(value);
        node.next = head;
        head = node;
        tail.next = head;
    }

    public void insertAtLast(int value){
        if (head == null) {
            insertAtFirst(value);
        } else {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            node.next = head;
        }
    }

//    public void insertAtIndex(int index, int value){
//        Node current = head;
//        int pos = 0;
//
//        if(index == 0){
//            Node node = new Node(value);
//            node.next = head;
//            head = node;
//            return;
//        }
//
//        while (current!=null && pos < index-1){
//            pos++;
//            current = current.next;
//        }
//
//        if(current!=null){
//            Node node = new Node(value);
//            node.next = current.next;
//            current.next = node;
//            return;
//        }
//
//        throw new IndexOutOfBoundsException("Please enter valid index");
//    }
//
//    public void remove(int value) {
//        if (head == null) {
//            return;
//        }
//
//        if (head.value == value) {
//            head = null;
//            return;
//        }
//
//        Node current = head;
//
//        while (current.next != null && current.next.value != value) {
//            current = current.next;
//        }
//
//        if (current.next != null) {
//            current.next = current.next.next;
//        }
//    }
//
//    public void removeFirst(){
//        if (head != null){
//            head = head.next;
//        }
//    }
//
//    public void removeLast(){
//        if(head == null){
//            return;
//        }
//
//        if(head.next == null){
//            head = null;
//            return;
//        }
//
//        Node current = head;
//        while (current.next.next != null){
//            current = current.next;
//        }
//        current.next = null;
//    }
//
    public int getLength() {
        if(head==null){
            return 0;
        }
        int count=0;
        Node current = head;
        do{
            count++;
            current = current.next;
        } while (current!=head);

        return count;
    }
//
//    //following zero based indexing
//    public int search(int value){
//        int pos = -1;
//        Node current = head;
//        while (current!=null){
//            pos++;
//            if(current.value==value){
//                return pos;
//            }
//            current = current.next;
//        }
//        return -1;
//    }
//
//    public int get(int index){
//        Node current = head;
//        int pos = 0;
//
//        while (current!=null){
//            if(pos == index){
//                return current.value;
//            }
//            pos++;
//            current = current.next;
//        }
//
//        throw new IndexOutOfBoundsException("Please enter valid index");
//    }

    public void print() {
        Node current = head;
        if(head!=null){
            do{
                System.out.print(current.value + " -> ");
                current = current.next;
            }while (current!=head);
            System.out.println("HEAD");

        }
    }


    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
