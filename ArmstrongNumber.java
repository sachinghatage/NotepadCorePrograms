public class ArmstrongNumber{
	public static void main(String[] args){
		int n=370;
		check(n);
	}

	public static void check(int n){
		int temp=n;
		int p=0,r=0;
		
		while(n>0){
		r=n%10;
		p=p+(r*r*r);
		n=n/10;
		}
		if(temp==p){
			System.out.print("armstrong number");
		}else{
			System.out.print("not armstrong");
		}
	}
}