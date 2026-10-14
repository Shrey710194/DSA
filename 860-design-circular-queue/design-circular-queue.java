class MyCircularQueue {
    int[] q; int Front, count, capacity;
    public MyCircularQueue(int k) {
        q=new int[k];
        Front=0; count=0; capacity=k;
    }
    
    public boolean enQueue(int value) {
        if(count==capacity){
            return false;
        }
        int Rear = (Front+count)%capacity;
        q[Rear]=value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(count==0){
            return false;
        }
        Front=(Front+1)%capacity;
        count--;
        return true;
    }
    
    public int Front() {
        if(count==0){
            return -1;
        }
        return q[Front];
    }
    
    public int Rear() {
        if(count==0){
            return -1;
        }
        int rear = (Front + count - 1) % capacity;
        return q[rear];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count==capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */