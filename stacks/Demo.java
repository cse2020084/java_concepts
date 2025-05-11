package stacks;
class Stack{
    private int[] stack;
    private int maxSize;
    private int top;
    Stack(int maxSize){
        this.maxSize=maxSize;
        stack=new int[this.maxSize];
        top=-1;
    }

    public void push(int value) throws StackOverflowException{
        if (top >= maxSize - 1) {
            throw new StackOverflowException("Stack may have overflowed");
        }
        stack[++top]=value;
    }

    public int peek() throws StackUnderflowException{
        if(top<0){
            throw new StackUnderflowException("Stack may have underflowed");
        }
        return stack[top];
    }

    public int poll() throws StackUnderflowException{
        if(top<0){
            throw new StackUnderflowException("Stack may have underflowed");
        }

        int res=stack[top];
        stack[top]=0;
        top--;
        return res;
    }

    

}
public class Demo {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        try{
            s.push(5);
            s.push(6);  
            s.push(11); 
            s.poll();
            s.poll();  
            System.out.println(s.peek());
        }catch(StackOverflowException e){
            System.out.println(e);
        }catch(StackUnderflowException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
