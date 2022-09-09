import java.util.Scanner;
class color
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a;
        a=sc.nextLine().charAt(0);
        if(a=='i' || a=='I')
        {
            System.out.println("Indigo");
        }
        else if(a=='b' || a=='B')
        {
            System.out.println("Blue");
        }
        else if(a=='g' || a=='G')
        {
            System.out.println("Green");
        }
        else if(a=='y' || a=='Y')
        {
            System.out.println("Yellow");
        }
        else if(a=='o' || a=='O')
        {
            System.out.println("Orange");
        }
        else if(a=='r' || a=='R')
        {
            System.out.println("Red");
        }
        else
        {
             System.out.println("-1");
        }
    }
}