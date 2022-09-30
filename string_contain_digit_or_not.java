import java.util.Scanner;
class digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(Character.isDigit(ch))
            {
                b+=1;
            }
        }
        if(b==0)
        {
            System.out.println("Doesn't contain digit");
        }
        else
        {
            System.out.println("Contains "+b+" digit");
        }
    }
}