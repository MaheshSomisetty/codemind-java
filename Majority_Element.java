import java.util.*;
class majority
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
        for(int ele:b)
        {
            al.add(ele);
        }
        HashSet<Integer> hs=new HashSet<Integer>(al);
        for(int ele:hs)
        {
            if(Collections.frequency(al,ele)>a/2)
            {
                System.out.print(ele);
            }
        }
    }
}