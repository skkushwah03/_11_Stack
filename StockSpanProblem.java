package _11_Stackk;
class StockSpanProblem {
    /* 
    static class Stack{
        int size;
        int top;
        int arr[];
        Stack(int size){
            this.size=size;
            this.top=-1;
            this.arr=new int[size];
        }
        boolean isEmpty(){
            return top==-1;
        }
        boolean isFull(){
            return top==size-1;
        }
        void push(int data){
            if(!isFull()){
                arr[++top]=data;
            }
        }
        int pop(){
            if(!isEmpty()){
                return arr[top--];
            }
            return -1;
        }
        int peek(){
            if(!isEmpty()){
                return arr[top];
            }
            return -1;
        }
    }
    static int[] calculateSpan(int price[],int n){
        int span[]=new int[n];
        Stack s=new Stack(n);
        s.push(0);
        span[0]=1;
        for(int i=1;i<n;i++){
            while(!s.isEmpty() && price[s.peek()]<=price[i]){
                s.pop();
            }
            span[i]=(s.isEmpty())?(i+1):(i-s.peek());
            s.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int price[]={100,80,60,70,60,75,85};
        int n=price.length;
        int span[]=calculateSpan(price, n);
        for(int i=0;i<n;i++){
            System.out.print(span[i]+" ");
        }
    }
    */
   public static void stockSpan(int stocks[],int span[]){
        java.util.Stack<Integer> s=new java.util.Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            while(!s.isEmpty() && stocks[s.peek()]<=stocks[i]){
                s.pop();
            }  
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-s.peek();
            }
            s.push(i);
        }
    }
   
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,75,85};
        int span[]=new int[stocks.length];
        stockSpan(stocks, span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
         
}
