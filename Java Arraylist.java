/*Code provided by hakerarenatutorials.wordpress.com*/

import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> base=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            base.add(new ArrayList<Integer>(d));
            for(int j=0;j<d;j++)
                base.get(i).add(sc.nextInt());
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=sc.nextInt(),y=sc.nextInt();
            if(base.get(x-1).size()>=y)
            {
                int ans=base.get(x-1).get(y-1);
                System.out.println(ans);
            }
            else
                System.out.println("ERROR!");
        }
    }
}
