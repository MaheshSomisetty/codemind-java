import java.util.Scanner;
class factori
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j;
        for(i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int c=1;
            for(j=b;j>=1;j--)
            {
                c=c*j;
            }
            System.out.println(c);
        }
    }
}