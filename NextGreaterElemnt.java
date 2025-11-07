package _11_Stackk;

public class NextGreaterElemnt {
  public static void main(String[] args) {
    int arr[]={6,8,0,1,3};
    int n=arr.length;
    int nextGreater[]=new int[n];
    java.util.Stack<Integer> s=new java.util.Stack<>();
    for(int i=arr.length-1;i>=0;i--){
        while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
            s.pop();
        }
        if(s.isEmpty()){
            nextGreater[i]=-1;
        }
        else{
            nextGreater[i]=arr[s.peek()];
        }
        s.push(i);
  }
  for(int i=0;i<n;i++){
    System.out.print(nextGreater[i]+" ");
  }
  System.out.println();
  //next greater right
  //next greater left
  //next smaller right
  //next smaller left
}
}
