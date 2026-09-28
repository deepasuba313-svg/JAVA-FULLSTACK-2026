import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		boolean flag=true;
		if(a==2)
			flag=true;
		if(a==0 || a==1)
			flag=false;
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				flag=false;
				break;
			}
			
		}
		System.out.print(flag);
		ip.close();
	}

}
