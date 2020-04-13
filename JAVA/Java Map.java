/*Code provided by hakerarenatutorials.wordpress.com*/
import java.util.*;
import java.io.*;
class Solution
{
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        sc.nextLine();
		HashMap<String,String> map=new HashMap<String,String>();
        for(int i=0;i<n;i++)
        {
            String tmp=sc.nextLine(),x=sc.nextLine();
            map.put(tmp,x);
        }
        while(sc.hasNextLine())
        {
            String tmp=sc.nextLine();
            if(map.containsKey(tmp))
                System.out.println(tmp+"="+map.get(tmp));
            else
                System.out.println("Not found");
        }
	}
}



