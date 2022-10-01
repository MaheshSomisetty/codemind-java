import java.util.*;
class string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=s1+s2;
        char ch[]=s3.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
    }
}