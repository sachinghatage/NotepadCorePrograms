public class Anagram1{
	public static void main(String[] args){
		String s1="kee";
		String s2="peek";
		System.out.print(anagram(s1,s2));
	}

	public static boolean anagram(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}

		int[] count=new int[256];
		for(int i=0;i<s1.length();i++){
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}

		for(int i=0;i<256;i++){
			if(count[i]!=0){
				return false;
			}
		}
	return true;
	}
}