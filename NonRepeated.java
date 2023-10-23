import java.util.Map;
import java.util.LinkedHashMap;

public class NonRepeated
{
 public static void main(String[] args)
 { 
   String s="programmer";
   Character character=nonRepeat(s);
System.out.print(character);
  }

  public static Character nonRepeat(String s)
  {
    Map<Character,Integer> map=new LinkedHashMap<>();
    for(int i=0;i<s.length();i++)
    {
      char c=s.charAt(i);
       if(map.containsKey(c))
        {
            map.put(c,map.get(c)+1);
        }else{
                 map.put(c,1);
               }
     }

    for(Map.Entry<Character,Integer> entry:map.entrySet())
     {
	if(entry.getValue()==1){
		return entry.getKey();
                   }
      }

	return null;
}
}		