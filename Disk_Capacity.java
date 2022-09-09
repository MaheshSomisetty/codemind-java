import java.util.Scanner;
class disk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a,b,c,d;
        a=sc.nextLong();
        b=sc.nextLong();
        c=sc.nextLong();
        d=a*b*c*2*512;
        System.out.println(d);
    }
}