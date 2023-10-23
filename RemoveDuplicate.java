
import java.util.*;

public class RemoveDuplicate
{
  public static void main(String[] args)
  {
    int[] a={1,2,3,4,4,5,6,3,4,5,6,3};
    Arrays.sort(a);
    int n=a.length;
     n=removeDup(a,n);
      for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
      }
}

  public static int removeDup(int[] a,int n)
  {
    if(n==0 || n== 1)
      return n;

    int j=0;
    for(int i=0;i<n-1;i++)
     {
       if(a[i]!=a[i+1])
        {
           a[j++]=a[i]; 
         }
       }
       a[j++]=a[n-1];
    
     return j;
}
}