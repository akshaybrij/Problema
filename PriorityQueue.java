import java.util.*;
import java.io.*;
class Queue{
  public int compute(int[] arr){
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
    for(int i:arr){
      pq.add(i);
    }
    StringBuilder num1=new StringBuilder();
    StringBuilder num2=new StringBuilder();
    while(!pq.isEmpty())
    {
      num1.append(pq.poll());
      if(!pq.isEmpty()){
        num2.append(pq.poll());
      }
    }
    String z=num1.toString();
    int x=Integer.parseInt(z);
    String f=num2.toString();
    int y=Integer.parseInt(f);
    return x+y;
  }
  public static void main(String...args){
    int[] arr={6, 8, 4, 5, 2, 3};
    Queue q=new Queue();
    int result=q.compute(arr);
    System.out.println(result);
  }
}
