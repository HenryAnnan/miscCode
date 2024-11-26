public class stacks {
    public static void main(String[] args) {
    stacks.stack.push(5);
    System.out.println(stacks.stack.peek());
    }

    public static class stack{
        private static final int[] stackArray = new int[10];
        private static int stackPointer = 0;

        public stack(){
            stackPointer = 0;
        }
        public static void push(int pushValue){
            stackArray[stackPointer] = pushValue;
            stackPointer ++;
        }
        public static int peek(){
        return stackArray[stackPointer-1];

        }
        public static int pop(){
            int item = stackArray[stackPointer-1];
            stackPointer --;
            return item;
        }
    }
}
