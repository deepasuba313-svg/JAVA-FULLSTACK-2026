import java.util.Scanner;
import java.util.*;
public class prb22 {

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
		
		int max=Integer.MAX_VALUE;
		for(int value : map.values())
		{
		    if(value<max)
		    	max=value;
		}
		
		char c=' ';
		for(char key : map.keySet())
		{
		    if(map.get(key) == max)
		    {
		        c=key;
		    }
		}
		
		System.out.print(c+" -> "+max);	
	ip.close();	
	}

}
