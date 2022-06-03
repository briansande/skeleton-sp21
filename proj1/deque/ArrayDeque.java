package deque;

public class ArrayDeque<T> {


    private T[] items;

    private int size;
    private int nextFirst;
    private int nextLast;

    private static float RFACTOR = 2;

    public ArrayDeque(){
        size = 0;
        items = (T[]) new Object[8];

    }

    private void resize(int cap){
        T[] newArray = (T[]) new Object[cap];
        System.arraycopy(this.items, 0, newArray,0, this.size);

        this.items = newArray;

    }

//    /** Helper method to create the sentinel node */
//    private void createSentinel(){
//
//    }
//
//
//    /** Adds and item of type T to the front of the deque */
//    public void addFirst(T item){
//
//
//    }
//
//    /** Adds and item of type T to the back of the deque */
//    public void addLast(T item){
//
//
//    }
//
//    /** Returns true if the deque is empty, otherwise returns false */
//    public boolean isEmpty(){
//        return this.size() == 0;
//    }
//
//    /** Returns the number of items in the deque */
//    public int size(){
//        return size;
//    }
//
//
//    /** Prints the items in the deque from first to last, separated by a space, and ending with a newline */
//    public void printDeque(){
//
//
//    }
//
//
//    /** Removes and return the first item of the deque */
//    public T removeFirst(){
//
//
//    }
//
//    /** Removes and returns the last item of the deque */
//    public T removeLast(){
//
//    }
//
//
//
//    /** Gets the item at the given index. 0 is the front, 1 is next, etc. Returns null if the item doesn't exist */
//    public T get(int index){
//
//    }

    public static void main(String args[]){
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();


    }
}
