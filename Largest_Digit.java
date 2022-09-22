import java.util.Scanner;
class largest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,c=0;
        while(a!=0)
        {
            b=a%10;
            if(b>c)
            {
                c=b;
            }
            a=a/10;
        }
        System.out.println(c);
    }
}