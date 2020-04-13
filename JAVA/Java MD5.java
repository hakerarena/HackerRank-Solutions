/*Code provided by hakerarenatutorials.wordpress.com*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.security.*;
import java.util.regex.*;
public class Solution 
{
    public void convertMD5(String str)
    {
        try
        {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] arr=md.digest(str.getBytes());
            BigInteger bi=new BigInteger(1,arr);
            String tmp=bi.toString(16);
            while (tmp.length()<32) 
                tmp="0"+tmp; 
            System.out.println(tmp);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Solution s=new Solution();
        s.convertMD5(str);    
    }
}
