public class PalindromeNumber{
	public static void main(String[] args){
		int n=121212121;
		check(n);
	}

	public static void check(int n){
		int temp=n,sum=0,r=0;
		while(n>0){
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==temp){
			System.out.print("palindrome");
		}else{
			System.out.print("not palindrome");
		}
	}
}