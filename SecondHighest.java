public class SecondHighest
{
  public static void main(String[] args)
   {
      int[] a={1,2,3,4,5,6};
       System.out.print(second(a));
    }
  public static int second(int[] a)
  {
    int highest=Integer.MIN_VALUE;
    int secondHigh=Integer.MIN_VALUE;
     for(int i:a)
     {
       if(i>highest)
        {
          secondHigh=highest;
          highest=i;
         
         }
    //  if(i>secondHigh&&i<highest){
    //     secondHigh=i;}
     }

    return secondHigh;
}
}