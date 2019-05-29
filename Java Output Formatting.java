/*Code provided by hakerarenatutorials.wordpress.com*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int k=0;k<3;k++)
            {
                String s1=sc.next();
                int num=sc.nextInt(),tmp=num,count=0,size=s1.length();
                do
                {
                    ++count;
                    tmp/=10;
                }
                while(tmp!=0);
                System.out.print(s1);
                for(int i=size;i<15;i++)
                    System.out.print(" ");
                for(int i=count;i<3;i++)
                    System.out.print("0");
                System.out.println(num);
            }
            System.out.println("================================");

    }
}



