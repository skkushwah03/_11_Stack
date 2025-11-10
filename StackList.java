package _11_Stackk;
import java.util.ArrayList;
public class StackList {
    static class Stack{
        static ArrayList<Integer> lst=new ArrayList<>();
        
        public static boolean isEmpty(){
            return lst.size()==0;
        }
        //push
        public static void push(int data){
            lst.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=lst.get(lst.size()-1);
            lst.remove(lst.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
        int top=lst.get(lst.size()-1);
        return top;
        }
    }    
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
    }
}
