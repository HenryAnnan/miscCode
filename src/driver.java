public class driver {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue("Hello");
        queue.enqueue("Bye");
        queue.enqueue("its working");
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
