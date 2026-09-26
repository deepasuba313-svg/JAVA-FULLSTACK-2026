import java.util.Scanner;
import java.util.*;
public class prb23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str=ip.nextLine();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(!map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), 1);
			}
			else
			{
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}
		
		
		char c=' ';
		for(char key : map.keySet())
		{
		    if(map.get(key) == 1)
		    {
		        c=key;
		        break;
		    }
		}
		
		System.out.print(c);	
	ip.close();	
	}

}
