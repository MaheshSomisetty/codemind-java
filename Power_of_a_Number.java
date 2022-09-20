import java.util.Scanner;
class power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double d;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        d=Math.pow(a,b);
        System.out.println((int)d%c);
    }
}