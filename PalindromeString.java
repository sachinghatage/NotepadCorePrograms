public class PalindromeString{
 public static void main(String[] args){
   String s="mom";
    System.out.print(palindrome(s));
}

 public static boolean palindrome(String s){
   for(int i=0;i<s.length();i++){
     if(s.charAt(i)!=s.charAt(s.length()-1-i)){
        return false;
      }
}
return true;
}
}