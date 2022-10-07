import java.util.*;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int c=0,d=0;
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
            c+=1;
            d+=b[i];
        }
        int e=d/c;
        int x=0;
        for(int ele:b)
        {
            if(ele<=e)
            {
                x+=1;
            }
        }
        System.out.print(x);
        
    }
}