/*Code provided by hakerarenatutorials.wordpress.com*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static Scanner sc=new Scanner(System.in);
    static boolean flag=false;
    static int B,H;
    static 
    {
        B=sc.nextInt();
        H=sc.nextInt();
        if(B>0&&H>0)
            flag=true;
        else
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }
    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

