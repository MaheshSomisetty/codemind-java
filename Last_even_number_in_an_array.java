import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=a-1;i>=0;i--)
        {
            if(b[i]%2==0)
            {
                System.out.print(b[i]);
                break;
            }
        }
    }
}