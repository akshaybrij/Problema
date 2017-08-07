import java.util.*;
import java.io.*;
class Ar{
  int Max=0;
  int Psuedo=0;
  public void rotate(int[] arr){
    int temp=arr[0];
    for(int i=0;i<arr.length-1;i++){
      arr[i]=arr[i+1];
    }
    arr[arr.length-1]=temp;
  }
  public int compute(int[] a){
    for(int la=0;la<a.length;la++){
     for(int i=0;i<a.length;i++){
         Psuedo=Psuedo+i*a[i];
       }
     if(Psuedo>Max){
       Max=Psuedo;
     }
     else{
       rotate(a);
     }

     Psuedo=0;
  }
     return Max;
  }
  public static void main(String...args){
    int array[]={10,11, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Ar arr= new Ar();
    int max=arr.compute(array);
    System.out.println(max);
  }
}
