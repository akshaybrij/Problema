import java.util.*;
import java.io.*;
class Swap{
  int temp;
  public void swap(int[] arr,int k){
    while(k!=0){
      temp=arr[k];
      arr[k]=arr[k-1];
      arr[k-1]=temp;
      k-=1;
    }
  }
  public void printOut(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+",");
    }
  }
  public static void main(String...args){
    int arr[]={7, 6, 9, 2, 1};
    Swap sp=new Swap();
    sp.swap(arr,3);
    sp.printOut(arr);
  }

}
