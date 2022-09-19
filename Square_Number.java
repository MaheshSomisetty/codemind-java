import java.util.Scanner;
class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b=0;
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(i*i+j*j==a)
                {
                    b=1;
                }
            }
        }
        if(b==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}