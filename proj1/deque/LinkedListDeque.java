package deque;

public class LinkedListDeque<T> {
    public class Node{
        public T item;
        public Node next;
        public Node prev;

        public Node(Node n_front, T i, Node n_back){
            prev = n_front;
            item = i;
            next = n_back;
        }
    }


    private Node sentinel;

    private int size;

    /** Create an empty LLDeque */
    public LinkedListDeque(){
        size = 0;
        createSentinel();


    }

    /** Create a LLDeque with one item */
    public LinkedListDeque(T item){
        size = 1;
        createSentinel();

        Node newNode = new Node(sentinel, item, sentinel);
        sentinel.next = newNode;
        sentinel.prev = newNode;

    }

    /** Helper method to create the sentinel node */
    private void createSentinel(){
        sentinel = new Node(null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }


    /** Adds and item of type T to the front of the deque */
    public void addFirst(T item){
        Node newNode = new Node(sentinel, item, sentinel.next);
        sentinel.next.prev = newNode;
        sentinel.next = newNode;
        size += 1;

    }

    /** Adds and item of type T to the back of the deque */
    public void addLast(T item){
        Node newNode = new Node(sentinel.prev, item, sentinel);
        sentinel.prev.next = newNode;
        sentinel.prev = newNode;
        size += 1;


    }

    /** Returns true if the deque is empty, otherwise returns false */
    public boolean isEmpty(){
        return this.size() == 0;
    }

    /** Returns the number of items in the deque */
    public int size(){
        return size;
    }


    /** Prints the items in the deque from first to last, separated by a space, and ending with a newline */
    public void printDeque(){
        // Todo test what happens is list is empty
        Node n = sentinel.next;
        while (n.item != null){
            System.out.print(n.item+" ");
            n = n.next;
        }
        System.out.println();

    }


//    /** Removes and return the first item of the deque */
//    public T removeFirst(){
//
//    }
//
//    /** Removes and returns the last item of the deque */
//    public T removeLast(){
//
//    }
//
//    /** Gets the item at the given index. 0 is the front, 1 is next, etc. Returns null if the item doesn't exist */
//    public T get(int index){
//
//    }
//
//

////    /**  */
////    public Iterator<T> iterator(){
////    }
////
////    /**  */
////    public boolean equals(Object o){
////    }
////

    public static void main(String args[]){
//        LinkedListDeque<Integer> ll = new LinkedListDeque<>(5);
//        System.out.println(ll.size());
//        System.out.println(ll.isEmpty());

        LinkedListDeque<Integer> l2 = new LinkedListDeque<>();


        l2.addFirst(10);
        l2.addLast(20);
        l2.addLast(30);
        l2.addLast(40);
        l2.addFirst(5);
        l2.addFirst(1);

        System.out.println(l2.size());
        System.out.println(l2.isEmpty());
        l2.printDeque();


    }

}
