package hashmap;

import java.util.Iterator;
import java.util.LinkedList;

class Node{
    int key;
    int value;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}


class HashMap{
    private LinkedList<Node>[] bucketArray; // array of linkedlist of nodes
    private final int DEFAULT_INITIAL_SIZE=16;
    private final float DEFAULT_LOAD_FACTOR=0.75f;

    public HashMap(){
        createBucketArray(DEFAULT_INITIAL_SIZE); //we initialize the bucket array
    }

    private void createBucketArray(int size){
        /*
         * can not create directly -> bucketArray = new LinkedList<Node>[DEFAULT_INITIAL_SIZE];
         * as some generic problem 
         * java does not allow
         */
        bucketArray=new LinkedList[size];
        for (int i = 0; i <size; i++) {
            bucketArray[i] = new LinkedList<>();
        }
    }

    private int hashFunction(int key){
        int arraySize=bucketArray.length;
        return key%arraySize;
    }

    private int traverseLinkedList(int key,LinkedList<Node> linkedList){
        for(int i=0;i<linkedList.size();i++){
            if(linkedList.get(i).key==key) return i;
        }    
        return -1;
    } 
    
    public void put(int key, int value){
        int hashKey=this.hashFunction( key);
        LinkedList<Node> currNode=bucketArray[hashKey];
        int index=traverseLinkedList(key,currNode);
            if(index==-1){
                Node newNode=new Node(key,value);
                bucketArray[hashKey].add(newNode);
            }else{
                Node updatNode=currNode.get(index);
                updatNode.value=value;
            }
    }
}

public class Demo {
    public static void main(String[] args) {
        
    }
}
