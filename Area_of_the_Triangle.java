import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,e,f;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=(a+b+c)/2;
        e=d*(d-a)*(d-b)*(d-c);
        f=Math.sqrt(e);
        System.out.format("%.2f",f);

    }
}