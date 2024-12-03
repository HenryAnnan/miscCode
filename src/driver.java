public class driver {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue("1");
        queue.enqueue("2");
        System.out.println(queue.peek());
        queue.enqueue("3");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        // Expected output: 1, 1,2,3
    }
}
