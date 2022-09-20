import java.util.Scanner;
class prime
{
    public static boolean prime(int n)
    {
        int i;
        if(n<2)
        {
            return false;
        }
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(prime(i))
            {
                System.out.println(i);
            }
        }
    }
}