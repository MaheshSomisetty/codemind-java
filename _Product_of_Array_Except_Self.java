import java.util.*;
class product
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int c=1;
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
            c*=b[i];
        }
        for(int i=0;i<a;i++)
        {
            System.out.print((c/b[i])+" ");
        }
        
    }
}