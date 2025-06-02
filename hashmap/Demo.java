package hashmap;

import java.util.Iterator;
import java.util.LinkedList;



class HashMap<K,V>{
    private LinkedList<Node>[] bucketArray; // array of linkedlist of nodes
    private final int DEFAULT_INITIAL_SIZE=3;
    private final float DEFAULT_LOAD_FACTOR=0.75f;
    private int size=0;

    private class Node{
        K key;
        V value;
        Node next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }


    public HashMap(){
        initializeBucketArray(DEFAULT_INITIAL_SIZE); //we initialize the bucket array
    }

    private void initializeBucketArray(int size){
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

    private int hashFunction(K key){
        int arraySize=bucketArray.length;
        return Math.abs(key.hashCode())%arraySize;
    }

    private void reHash(){
        LinkedList<Node>[] oldBucketArray=bucketArray;
        initializeBucketArray(oldBucketArray.length * 2);
        size=0;
        for(var oldBucketLinkedList:oldBucketArray){
            for(var oldBucketNode:oldBucketLinkedList){
                put(oldBucketNode.key,oldBucketNode.value);
            }
        }
    }

    private int traverseLinkedList(K key,LinkedList<Node> linkedList){
        for(int i=0;i<linkedList.size();i++){
            if(linkedList.get(i).key==key) return i;
        }    
        return -1;
    } 
    
    public void put(K key, V value){
        int hashKey=this.hashFunction( key);
        LinkedList<Node> currList=bucketArray[hashKey];
        int index=traverseLinkedList(key,currList);
            if(index==-1){
                Node newNode=new Node(key,value);
                currList.add(newNode);
                size++;
            }else{
                Node updatNode=currList.get(index);
                updatNode.value=value;
            }

            if(size>bucketArray.length * DEFAULT_LOAD_FACTOR) reHash();
    }

    public V get(K key){
        int hashKey=this.hashFunction( key);
        LinkedList<Node> currList=bucketArray[hashKey];
        int index=traverseLinkedList(key,currList);
        if(index!=-1){
            Node getNode=currList.get(index);
            return getNode.value;
        }        
        return null;
    }

    public V remove(K key){
        int hashKey=this.hashFunction(key);
        LinkedList<Node> currList=bucketArray[hashKey];
        int index=traverseLinkedList(key,currList);
        if(index!=-1){
                Node getNode=currList.get(index);
                V value=getNode.value;
                currList.remove(index);
                size--;
                return value;          
        }        
        return null;
    }

    public int size(){
        return size;
    }
    /*
     * private function, just public for debugging
     */
    public int capacity(){
        return bucketArray.length;
    }

    public double load(){
        return (size * 1.0)/bucketArray.length;
    } 
}


public class Demo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap();

        hashMap.put(1,3);
        hashMap.put(2,5);
        System.out.println("size "+hashMap.size());
        System.out.println("capacity "+hashMap.capacity()+" "+"load "+hashMap.load());
        System.out.println(hashMap.get(2));
        hashMap.put(2, 7);
        System.out.println("size "+hashMap.size());
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.remove(2));
        System.out.println("size "+hashMap.size());
        System.out.println(hashMap.get(2));
        System.out.println("size "+hashMap.size());


    }
}
