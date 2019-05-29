/*Code provided by hakerarenatutorials.wordpress.com*/

import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
        String s = scan.nextLine(),tmp="";
        ArrayList<String> arr=new ArrayList<>(0);
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>=(char)65&&s.charAt(i)<=(char)90||s.charAt(i)>=(char)97&&s.charAt(i)<=(char)122)
                tmp=tmp+s.charAt(i);
            else
            {
                if(tmp!="")
                    arr.add(tmp);
                tmp="";
            }
            if(i==n-1&&tmp!="")
                arr.add(tmp);
        }
        String str[]=new String[arr.size()];
        for(int i=0;i<arr.size();i++)
            str[i]=arr.get(i);
        System.out.println(str.length);
        for(int i=0;i<arr.size();i++)
            System.out.println(str[i]);
        scan.close();
    }
}

