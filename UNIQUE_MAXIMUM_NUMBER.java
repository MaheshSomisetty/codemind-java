import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> al1=new ArrayList<Integer>();
        for(int ele:b)
        {
            al.add(ele);
        }
        for(Integer ele:al)
        {
            if(Collections.frequency(al,ele)==1)
            {
                al1.add(ele);
            }
        }
        if(al1.isEmpty())
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(Collections.max(al1));
        }
    }
}