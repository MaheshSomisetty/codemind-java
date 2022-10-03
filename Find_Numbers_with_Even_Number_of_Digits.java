import java.util.Scanner;
class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int c=0,len;
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
            len=(int)Math.log10(b[i])+1;
            if(len%2==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
        
    }
}