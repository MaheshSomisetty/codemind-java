import java.util.Scanner;
class count
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
        for(int i=1;i<a-1;i++)
        {
            if(b[i-1]%2!=0 && b[i+1]%2!=0 && b[i]%2==0)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}