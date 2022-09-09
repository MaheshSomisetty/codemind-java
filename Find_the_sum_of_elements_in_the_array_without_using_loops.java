import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,b[],c=0;
        a=sc.nextInt();
        b=new int[a];
        for(i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
         for(i=0;i<a;i++)
        {
            c+=b[i];
        }
        System.out.println(c);
    }
}