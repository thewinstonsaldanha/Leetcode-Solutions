class MyQueue {
    
    private Stack <Integer>input= new Stack<>();
    private Stack <Integer> output= new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(output.isEmpty()){
            shiftStacks();
        }
        
        return output.pop();
        
    }
    
    public int peek() {
        if(output.isEmpty()){
             shiftStacks();
        }
        
        return output.peek();
        
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
        
    }
    
    public void shiftStacks(){
        while(!input.isEmpty()){
            int temp= input.pop();
            output.push(temp);
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */