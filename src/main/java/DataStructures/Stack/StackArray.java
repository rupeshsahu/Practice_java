package DataStructures.Stack;

public class StackArray {

    private int arr[];
    private int top=-1;
    public StackArray(int size)
    {
        arr=new int[size];
    }

    public void push(int a){
        top++;
        arr[top]=a;
    }
    public int pop(){
        int a=arr[top];
        top--;
        return a;
    }
    public  int peek(){
        return arr[top];
    }
}
