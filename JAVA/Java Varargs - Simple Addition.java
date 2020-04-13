/*Code provided by hakerarenatutorials.wordpress.com*/
class Add
{
    void add(int ...n)
    {
        int sum=0,size=0;
        for(int i:n)
        {
            System.out.print(i);
            sum+=i;
            ++size;
            if(size!=n.length)
                System.out.print("+");
        }
        System.out.println("="+sum);
    }
}
