/*Code provided by hakerarenatutorials.wordpress.com*/
import java.util.Scanner;

public class Anagrams 
{
    static boolean isAnagram(String a, String b) 
    {
        char alpha[]=new char[26];
        for(int i=97,j=0;i<123&&j<26;i++,j++)
            alpha[j]=(char)i;
        char beta[]=new char[26];
        for(int i=65,j=0;i<91&&j<26;i++,j++)
            beta[j]=(char)i;
        int A[]=new int[26];
        int B[]=new int[26];
        for(int i=0;i<26;i++)
        {
            A[i]=0;
            B[i]=0;
        }
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<26;j++)
            {
                if(a.charAt(i)==alpha[j]||a.charAt(i)==beta[j])
                {
                    A[j]++;
                }
            }
        }
        for(int i=0;i<b.length();i++)
        {
            for(int j=0;j<26;j++)
            {
                if(b.charAt(i)==alpha[j]||b.charAt(i)==beta[j])
                {
                    B[j]++;
                }
            }
        }
        boolean flag=true;
        for(int i=0;i<26;i++)
        {
            if(A[i]!=B[i])
            {
                flag=false;
                break;
            }
        }
        return flag;
    }	
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
