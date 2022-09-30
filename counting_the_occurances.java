import java.util.Scanner;
class occur
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.nextLine().charAt(0);
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(c==ch)
            {
                a+=1;
            }
        }
        if(a==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(a);
        }
        
       
    }
}