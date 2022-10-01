import java.util.*;
class palindrome
{
    public static boolean pal(String s)
    {
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            String s=sc.next();
            if(pal(s))
            {
                if(s.length()%2==0)
                {
                    System.out.println("YES EVEN");
                }
                else
                {
                    System.out.println("YES ODD");
                }
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}