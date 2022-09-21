import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,c=0,d=1;
        while(a!=0)
        {
            b=a%10;
            c+=b;
            d*=b;
            a=a/10;
        }
        System.out.println(d-c);
    }
}