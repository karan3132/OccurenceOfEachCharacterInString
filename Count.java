import java.util.*;
class Count
{
static void charCount(String input)
{
HashMap<Character,Integer> ccm=new HashMap<Character,Integer>();
char strArr[]=input.toCharArray();
for(char c:strArr)
{
if(ccm.containsKey(c))
{
ccm.put(c,ccm.get(c)+1);
}
else
{
ccm.put(c,1);
}

}
System.out.println(ccm);
}
public static void main(String args[])
{
charCount("KARAN");
}
}

