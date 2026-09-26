import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class prb27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the string - 1: ");
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
		System.out.print("Please enter the string - 2: ");
		String str1=ip.nextLine();
		Map<Character, Integer> map1 = new HashMap<>();
		for(int i=0;i<str1.length();i++)
		{
			if(!map1.containsKey(str1.charAt(i)))
			{
				map1.put(str1.charAt(i), 1);
			}
			else
			{
				map1.put(str1.charAt(i), map1.get(str1.charAt(i)) + 1);
			}
		}
		if(map.equals(map1))
			System.out.print(true);
		else
			System.out.print(!true);
		ip.close();
	}

}
