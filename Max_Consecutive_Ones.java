import java.util.*;
class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(b[i]==1)
            {
                c+=1;
            }
            al.add(c);
            if(b[i]==0)
            {
                c=0;
            }
        }
        System.out.println(Collections.max(al));
    }
}