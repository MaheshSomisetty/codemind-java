import java.util.*;
class sorted
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int c[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
            c[i]=b[i]*b[i];
        }
        Arrays.sort(c);
        for(int i=0;i<a;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}