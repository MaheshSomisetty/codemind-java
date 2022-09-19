import java.util.Scanner;
class primes
{
    public static boolean prime(int n)
        {
            int i;
            if(n<2)
            {
                return false;
            }
            for(i=2;i<(int)Math.sqrt(n)+1;i++)
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0,i;
        for(i=a;i<=b;i++)
        {
            if(prime(i))
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
    
}