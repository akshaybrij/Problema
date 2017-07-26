import java.io.*;
import java.util.*;
class Min{
  int result=0;
  int rem=0;
  public int compute(int i,int j){
     if(i>j){
       swap(i,j);
     }
     while(j>0 && i>0){
       result+=j/i;
       rem=j%i;
       j=i;
       i=rem;
     }
     return result;
  }
  public void swap(int i,int j){
    int temp=i;
    i=j;
    j=temp;
  }
  public static void main(String...args){
    Min m= new Min();
    int h=m.compute(13,29);
    System.out.println(h);
  }
}
