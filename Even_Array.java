import java.util.*;
class even
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
        int c=0;
        for(int ele:b)
        {
            if(ele%2==0)
            {
                c+=1;
            }
        }
        if(c==a)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}