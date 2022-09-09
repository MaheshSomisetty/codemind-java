import java.util.Scanner;
class temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        float b;
        a=sc.nextInt();
        b=32+((a)*((float)9/5));
        System.out.printf("%.2f",b);
    }
}