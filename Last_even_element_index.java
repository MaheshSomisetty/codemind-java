import java.util.Scanner;
class last
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[],i;
        b=new int[a];
        for(i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=a-1;i>=0;i--)
        {
            if(b[i]%2==0)
            {
                System.out.println(i);
                break;
            }
        }
        
    }
}