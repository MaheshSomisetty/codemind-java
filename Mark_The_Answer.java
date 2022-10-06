import java.util.Scanner;
class mark
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c[]=new int[a];
        int d=0,e=0,i;
        for(i=0;i<a;i++)
        {
            c[i]=sc.nextInt();
        }
       for(i=0;i<a;i++)
       {
           if(c[i]<=b)
           {
               if(e>1)
               {
                   break;
               }
               d+=1;
              
           }
           else
           {
               e+=1;
           }
       }
        System.out.print(d);
    }
}