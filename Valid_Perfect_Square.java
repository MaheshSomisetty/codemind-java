import java.util.Scanner;
class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            double c=Math.sqrt(b);
            if(c==(int)c)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            
        }
    }
}