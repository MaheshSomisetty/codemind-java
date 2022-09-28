import java.util.Scanner;
class num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                b+=i;
            }
        }
        if(b>a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}