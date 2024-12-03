public class CircularQueue {
    private String myQueue[] = new String[5];
    private int headPointer = 0;
    private int tailPointer = 0;
    private int numOfItems = 0;

    public CircularQueue(){}

    public void enqueue(String newItem){
        if (numOfItems == myQueue.length){
            System.out.println("Queue Overflow"); 
            return;
        }else{
            myQueue[tailPointer] = newItem;
            tailPointer = (tailPointer = tailPointer+1) % myQueue.length;
            numOfItems++;
        }
    }

    public String dequeue(){
        if (numOfItems == 0){
            System.out.println("Queue Underflow");
            return "Queue Underflow";
        }else{
            String item = myQueue[headPointer];
            headPointer = (headPointer = headPointer +1) % myQueue.length;
            numOfItems--;
            return item;
        }
    }
    public String peek(){
        if (numOfItems !=0){
            return myQueue[headPointer];
        }else{
            return null;
        }
    }
}