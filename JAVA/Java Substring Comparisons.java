/*Code provided by hakerarenatutorials.wordpress.com*/

public static String getSmallestAndLargest(String s, int k) 
    {
        java.util.ArrayList<String> arr=new java.util.ArrayList<>(0);
        for(int i=0;i<s.length();i++)
        {
            if((i+k)<s.length()+1)
                arr.add(s.substring(i,i+k));
        }
        java.util.Collections.sort(arr);
        return arr.get(0)+"\n"+arr.get(arr.size()-1);
    }
