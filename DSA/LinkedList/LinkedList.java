public class LinkedList {

    private Node head;

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void insertAtLast(int value){
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
    }

    public void insertAtIndex(int index, int value){
        Node current = head;
        int pos = 0;

        if(index == 0){
            Node node = new Node(value);
            node.next = head;
            head = node;
            return;
        }

        while (current!=null && pos < index-1){
            pos++;
            current = current.next;
        }

        if(current!=null){
            Node node = new Node(value);
            node.next = current.next;
            current.next = node;
            return;
        }

        throw new IndexOutOfBoundsException("Please enter valid index");
    }

    public void remove(int value) {
        if (head == null) {
            return;
        }

        if (head.value == value) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next != null && current.next.value != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    public void removeLast(){
        if(head == null){
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public int getLength() {
        int count=0;
        Node current = head;
        while (current!=null){
            count++;
            current = current.next;
        }

        return count;
    }

    //following zero based indexing
    public int search(int value){
        int pos = -1;
        Node current = head;
        while (current!=null){
            pos++;
            if(current.value==value){
                return pos;
            }
            current = current.next;
        }
        return -1;
    }

    public int get(int index){
        Node current = head;
        int pos = 0;

        while (current!=null){
            if(pos == index){
                return current.value;
            }
            pos++;
            current = current.next;
        }

        throw new IndexOutOfBoundsException("Please enter valid index");
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
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