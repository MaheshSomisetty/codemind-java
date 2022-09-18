import java.util.Scanner;
class primes
{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
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
        int i,a,b[],c[],d=0,e=0;
        a=sc.nextInt();
        b=new int[a];
        c=new int[100];
        for(i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            if(isprime(b[i]))
            {
                c[i]=b[i];
                d=d+1;
                e+=c[i];
            }
        }
        System.out.printf("%.2f",(float)e/d);
    }
}