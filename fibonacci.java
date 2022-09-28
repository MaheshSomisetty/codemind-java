import java.util.Scanner;
class fibi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,a=0,b=1,c=0;
        for(i=0;i<n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            
        }
        
    }
}