import java.util.*;
class duplicate
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
        for(int i:b)
        {
            al.add(i);
        }
        HashSet<Integer> hs=new HashSet<Integer>(al);
        for(int j:hs)
        {
            if(Collections.frequency(al,j)>1)
            {
                System.out.print(j);
            }
        }
    }
}