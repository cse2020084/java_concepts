package linkedLists;
class Node{
    Node next;
    int value;

    public Node(int value){
        this.value=value;
    }
}

class LinkedList{
    Node node;
    Node head;
    Node tail;
    void add(int i){
        node=new Node(i);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=tail.next;
        }
    }

    void display(){
        Node start=head;
        while(start!=null){
            System.out.println(start.value);
            start=start.next;
        }
    }

    void displayReverse(Node start){
        if(start==null){
            return;
        }
        displayReverse(start.next);  
        System.out.println(start.value);
        
    }

    int size(){
        int count=0;
        Node start=head;
        while(start!=null){
            count++;
            start=start.next;
        }
        return count;
    }

    boolean contains(int value){
        Node start=head;
        while(start!=null){
            if(start.value==value) return true;
            start=start.next;
        }

        return false;
    }

    boolean delete(int value){
        if(head==null) return false;
        if(head.value==value){
            head=head.next;
            return true;
        }

        Node prev=head;
        Node curr=head.next;

        while(curr!=null){
            if(curr.value==value){
                prev.next=curr.next;
                curr.next=null;
                return true;
            }
            prev=curr;
            curr=curr.next;
        }
        return false;
    }

    void insertAt(int idx, int value) throws IndexLargerThanListSizeException{
        // try{
        //     if(idx>this.size()) throw new IndexLargerThanListSizeException("Index number exceeds LinkedList Size");
        // }catch(IndexLargerThanListSizeException e){
        //     System.out.println(e);
        //     return;
        // }
        if(idx>this.size()) throw new IndexLargerThanListSizeException("Index number exceeds LinkedList Size");
        node=new Node(value);
        if(idx==0){
            if(head==null){
                head=node;
            }else{
                node.next=head;
                head=node;
            }
            return;
        }
        Node prev=head;
        Node curr=head.next;
        int i=1;
        while(i<=idx){
            if(idx==i){
                prev.next=node;
                node.next=curr;
                return;
            }
            prev=curr;
            curr=curr.next;
            i++;
        }
    }

    
}
public class Demo {
    public static void main(String[] args) {
        // Node obj1=new Node(1);
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(5);
        ll.add(8);
        ll.add(7);
        try{
            ll.insertAt(1, 0);
            boolean numberForDelete=ll.delete(1);
            if(!numberForDelete) throw new IndexLargerThanListSizeException("Number Not Present");
            ll.display();
        }catch(IndexLargerThanListSizeException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

        


    }
    
}
