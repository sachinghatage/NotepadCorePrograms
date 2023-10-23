public class CapitalFirstLetter
{
	public static void main(String[] args)
    	{
      		String s="today is a peacefull Day";
      		String[] s1=s.split(" ");
      		capital(s1);
    	}

	public static void capital(String[] s1)
	{
		String s3="";
		for(String s2:s1)
     		{
       			char c=s2.charAt(0);
			if(c>='a' && c<='z')
			{
				 c=(char)(c-32);
			}
		 s3=c+s2.substring(1);
		System.out.print(s3+" ");
		}
		
	}
}
       