package priorityqueues;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyPriorityQueue{
    private List<Integer> l;
    Comparator<Integer> comparator;

    public MyPriorityQueue(Comparator<Integer> comparator){
        this.l=new ArrayList<>();
        this.comparator=comparator;
    }



    public void add(int value){
        l.add(value);
        this.addHeap(l.size()-1);
    }
// l.get(parentIndex)<l.get(index)
    public void addHeap(int index){      
        while(index>0){
            int parentIndex=(index-1)/2;
            if(parentIndex>=0 && comparator.compare(l.get(index), l.get(parentIndex))>=0){
                break;
            }else{
                this.swap(index,parentIndex);
            }
            index=parentIndex;
        }

    }

    public int peek(){
        if(l.size()==0) throw new NullPointerException("Empty Priority Queue");
        return l.get(0);
    }

    public int poll(){
        if(l.size()==0) throw new NullPointerException("Empty Priority Queue");
        int value=l.get(0);
        this.swap(0, l.size()-1);
        l.remove(l.size()-1);
        this.deleteHeap(0);
        return value;
    }


    public void deleteHeap(int index){
        while(index<l.size()){
            int left=(2*index)+1;
            int right=(2*index)+2;
            int smallest=index;
            if(left<l.size() && l.get(left)<l.get(smallest)){
                smallest=left;
            }
            if(right<l.size() && l.get(right)<l.get(smallest)){
                smallest=right;
            }
            
            if(index!=smallest){
                this.swap(index, smallest);
                index = smallest;
            }else break;
        }
    }

    public void swap(int index,int parentIndex){
        int value=l.get(index);
        int parentValue=l.get(parentIndex);

        l.set(parentIndex, value);
        l.set(index, parentValue);
    }
    

}
public class Demo {
    public static void main(String[] args) {
        Comparator<Integer> comp= (i,j) -> i<j ?-1:1;
        MyPriorityQueue pq=new MyPriorityQueue(comp);
        pq.add(1);
        pq.add(7);
        pq.add(2);
        pq.add(0);
        try{
            pq.poll();
            pq.poll();
            System.out.println(pq.peek());
        }catch(NullPointerException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
