/*Code provided by hakerarenatutorials.wordpress.com*/

import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        ArrayList<Long> arr=new ArrayList<Long>(n);
        for(int i=0;i<n;i++)
            arr.add(sc.nextLong());
        for(int i=0;i<n;i++)
        {
            long sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+arr.get(j);
                if(sum<0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
