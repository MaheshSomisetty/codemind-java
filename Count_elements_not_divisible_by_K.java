import java.util.Scanner;
class elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c[]=new int[a];
        for(int i=0;i<a;i++)
        {
            c[i]=sc.nextInt();
        }
        int d=0;
        for(int i=0;i<a;i++)
        {
            if(c[i]%b!=0)
            {
                d++;
            }
        }
        System.out.print(d);
    }
}