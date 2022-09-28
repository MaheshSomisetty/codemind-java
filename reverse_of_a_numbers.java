import java.util.Scanner;
class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0,c;
        while(a!=0)
        {
            c=a%10;
            b=b*10+c;
            a=a/10;
        }
        System.out.println(b);
    }
}