import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] arr1=new int [n];
        int [] arr2=new int [m];
        for (int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        for (int i=0;i<m;i++)
            arr2[i]=sc.nextInt();
        HashSet<Integer> a1=new HashSet<Integer>();
        for (int ele:arr1)
            a1.add(ele);
        HashSet<Integer> a2=new HashSet<Integer>();
        for (int ele:arr2)
            a2.add(ele);
        int a=0;
        for (int ele:a1){
            if (a2.contains(ele)==true)
                a+=1;
        }
        for (int ele:a2){
            if (a1.contains(ele)==true)
                a+=1;
        }
        System.out.print(a/2);
    }
}