import java.util.Scanner;
class small
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
        for(int i=0;i<a;i++)
        {
            int c=0;
            for(int j=0;j<a;j++)
            {
                if(b[i]>b[j])
                {
                    c+=1;
                }
            }
            System.out.print(c+" ");
            
        }
    }
}