import java.util.Scanner;
class palindrome
{
    public static boolean pal(int n)
    {
        int a,b=0,c;
        c=n;
        while(n!=0)
        {
            a=n%10;
            b=b*10+a;
            n=n/10;
        }
        if(c==b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(pal(a))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}