package queues;
class Queue<T>{
    private Object queue[];
    private int maxSize;
    private int front;
    private int rear;
    private int size;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queue=new Object[this.maxSize];
        this.front=-1;
        this.rear=-1;
        this.size=0;
    }


    public void offer(T value){
        if(this.size==this.maxSize) throw new IndexOutOfBoundsException("Queue is full");

        rear=(rear+1)%maxSize;
        queue[rear]=value;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T peek(){
        if(this.size==0) throw new IndexOutOfBoundsException("Queue is Empty");
        return (T) queue[(front+1)%maxSize];
    }


    @SuppressWarnings("unchecked")
    public T poll(){
        if(this.size==0) throw new IndexOutOfBoundsException("Queue is Empty");
        front=(front+1)%maxSize;
        T value=(T) queue[front];
        size--;
        queue[front] = null;
        return value;
    }

    
}
public class queueByArray {


    public static void main(String[] args) {
        Queue<Integer> q=new Queue<>(5);
        try{
            q.offer(1);
            q.offer(3);
            q.offer(9);
            System.out.println(q.peek());
            q.poll();
            System.out.println(q.peek());
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
        }
}
