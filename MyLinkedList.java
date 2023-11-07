public class MyLinkedList {
        Node head;
        Node tail;
        int size = 0;

    public void ShowList() {
        Node current = head;
        while (current!= null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }
    public void add(int value,int index) {
        Node newNode = new Node();
        newNode.value = value;
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        }else {
            Node Index = head;
            for (int i = 0; Index != null && i < index - 1; i++) {

                Index = Index.next;
            }
            newNode.next = Index.next;
            Index.next = newNode;

        }
        }
    public Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int getIndex(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return index;
    }

    }

