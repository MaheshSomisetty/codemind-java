import java.util.Scanner;
class add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,c=0;
        while(a!=0)
        {
            b=a%10;
            c+=b;
            a=a/10;
            if(a==0 && c>9)
            {
                a=c;
                c=0;
            }
        }
        System.out.println(c);
    }
}