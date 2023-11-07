class Main {
    static MyLinkedList linkedlist = new MyLinkedList();
            public static void main(String[] args) {

                linkedlist.add(56,0);
                linkedlist.add(10,1);
                linkedlist.add(27,2);

                linkedlist.ShowList();
                System.out.println(linkedlist.getIndex(10));
                System.out.println(linkedlist.getNode(0));
            }

        }


