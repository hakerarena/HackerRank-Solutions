/*Code provided by hakerarenatutorials.wordpress.com*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.charAt(0)<=B.charAt(0))
            System.out.println("No");
        else
            System.out.println("Yes");
        char[] strA=A.toCharArray();
        strA[0]-=32;
        String newA=new String(strA);
        char[] strB=B.toCharArray();
        strB[0]-=32;
        String newB=new String(strB);
        System.out.println(newA+" "+newB);
        
    }
}



