import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[];
        b=new int[a];
        int d=0;
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        for(int i=0;i<c;i++)
        {
            d+=b[i];
        }
        System.out.println(d);
    }
}