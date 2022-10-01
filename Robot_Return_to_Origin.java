import java.util.Scanner;
class robot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0,r=0,u=0,d=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='U')
            {
                u+=1;
            }
            else if(ch=='D')
            {
                d+=1;
            }
            else if(ch=='R')
            {
                r+=1;
            }
            else
            {
                l+=1;
            }
        }
        if(l==r && u==d)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}