import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prb26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		ip.close();
		
	}

}
