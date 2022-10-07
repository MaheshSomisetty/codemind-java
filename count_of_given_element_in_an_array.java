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
        int c=sc.nextInt();
        int d=0;
        for(int i=0;i<a;i++)
        {
            if(b[i]==c)
            {
                d+=1;
            }
        }
        System.out.print(d);
    }
}