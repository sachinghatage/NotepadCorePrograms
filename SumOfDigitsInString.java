public class SumOfDigitsInString
{
	static int sum=0;
	public static void main(String[] args)
	{
		String s="o1hgf3jh2kj2k6km4lk3";
		System.out.print(sumOf(s));
	}

	public static int sumOf(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0' && c<='9')
			{
				//sum+=Character.getNumericValue(c);
                                                                 sum+=c-'0';
			}
		}
		return sum;
	}
}