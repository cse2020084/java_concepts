package queues;
class Node<T>{
    T value;
    Node<T> next;

    Node(T value){
        this.value=value;
    }
}
class Queues<T>{
    Node<T> rear;
    Node<T> front;
    public void offer(T value){
        Node<T> newNode=new Node(value);
        if(front==null){
            front=rear=newNode;
        }else{
            rear.next=newNode;
            rear=rear.next;
        }    
    }

    public T peek(){
        if(front==null) throw new NullPointerException("Queue is empty");
        return front.value;
    }

    public T poll(){
        if(front==null) throw new NullPointerException("Queue is empty");
        T result=front.value;
        front=front.next;
        return result;
    }
}
public class queueByLinkedList {
    public static void main(String[] args) {
        Queues<Integer> q=new Queues<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        try{
            System.out.println(q.peek());
            q.poll();
            q.poll();
            System.out.println(q.peek());
        }catch(NullPointerException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
