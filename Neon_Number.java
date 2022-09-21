import java.util.Scanner;
class neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a*a;
        int d=0,c;
        while(b!=0)
        {
            c=b%10;
            d+=c;
            b=b/10;
        }
        if(d==a)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}