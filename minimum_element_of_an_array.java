import java.util.*;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int c=0,d=0;
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int ele:b)
        {
            al.add(ele);
        }
        System.out.print(Collections.min(al));
        
    }
}