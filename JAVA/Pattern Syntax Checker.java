/*Code provided by hakerarenatutorials.wordpress.com*/
import java.util.Scanner;
import java.util.regex.*;
public class Solution
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        int tC = Integer.parseInt(sc.nextLine());
        while(tC>0)
        {    
            String pattern = sc.nextLine();
            boolean valid = true;
            try 
            {
                Pattern p = Pattern.compile(pattern);    
            }
            catch(Exception e)
            {
                valid = false;
            }
            if (valid)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
            --tC;
        }
    }
}
