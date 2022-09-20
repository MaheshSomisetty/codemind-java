import java.util.Scanner;
class divisors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,c=0;
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        for(i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}