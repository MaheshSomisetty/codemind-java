import java.util.*;
class number
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
        int d[]=new int[c];
        for(int i=0;i<c;i++)
        {
            d[i]=sc.nextInt();
        }
        int w=sc.nextInt();
        int x=0;
        for(int i=0;i<a;i++)
        {
            if(b[i]<=w &&d[i]>=w)
            {
                x+=1;
            }
        }
        System.out.println(x);
    }
}