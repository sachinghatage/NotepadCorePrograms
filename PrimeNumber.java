public class PrimeNumber{
	public static void main(String[] args){
		int n=3;
		prime(n);
	}

	public static void prime(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
			       count++;}
		
		}
		if(count==2){
			System.out.print("prime number");
		}else{
			System.out.print("not prime number");
		}

	}
}