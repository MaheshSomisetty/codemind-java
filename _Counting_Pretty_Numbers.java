import java.util.*;
class numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,e;
        a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int d=0;
            b=sc.nextInt();
            c=sc.nextInt();
            for(int j=b;j<=c;j++)
            {
                e=j%10;
                if(e==2 || e==3 || e==9)
                {
                    d+=1;
                }
            }
            System.out.println(d);
        }
    }
}