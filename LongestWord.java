public class LongestWord{
	public static void main(String[] args){
		String s="I am learning java";
		find(s);
	}

	public static void find(String s){
	String longWord="";
	String[] s1=s.split(" ");
	for(String s2:s1){
		if(s2.length()>longWord.length()){
			longWord=s2;
		}
	}
	System.out.print(longWord);
	}
}