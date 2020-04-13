/*Code provided by hakerarenatutorials.wordpress.com*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
        {
            int tmp=sc.nextInt();
            arr.add(tmp);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            sc.nextLine();
            String tmp=sc.next();
            if(tmp.equals("Insert"))
            {
                int index=sc.nextInt(),key=sc.nextInt();
                arr.add(index,key);
            }
            else if(tmp.equals("Delete"))
            {
                int index=sc.nextInt();
                arr.remove(index);
            }
        } 
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i)+" ");   
    }
}

