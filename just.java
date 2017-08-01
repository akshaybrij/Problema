import java.util.*;
import java.io.*;
class Just{
  public void arrange(int[] arr){
    ArrayList<Integer> pq=new ArrayList<Integer>();
    ArrayList<Integer> pos=new ArrayList<Integer>();
    ArrayList<Integer> neg=new ArrayList<Integer>();
    for(int i=0;i<arr.length;i++){
      if(arr[i]>0){
        pos.add(arr[i]);
      }
      else if(arr[i]<0){
        neg.add(arr[i]);
      }

    }
    int i=0;
    while(i<pos.size() || i<neg.size()){
      pq.add(neg.get(i));
      pq.add(pos.get(i));
      i+=1;
    }
    Iterator<Integer> itr= pq.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }

  }
  public static void main(String...args){
    Just j= new Just();
    int[] arr={1,2,3,5,-1,-4,-2,-3};
    j.arrange(arr);
  }
}
