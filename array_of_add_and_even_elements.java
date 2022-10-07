import java.util.Scanner;
class follow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
            if(b[i]%2!=0)
            {
                System.out.print(b[i]+" ");
            }
        }
        for(int i=0;i<a;i++)
        {
           if(b[i]%2==0)
            {
                System.out.print(b[i]+" ");
            }
        }
        
    }
}