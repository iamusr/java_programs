import java.util.*;
public class Linearsearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,flag=0;
        System.out.println("Enter size of Array:");
        n = sc.nextInt();
        int[] e = new int[n];
        System.out.println("Enter elements:");
        for(i=0;i<n;i++)
        {
            e[i]=sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int s=sc.nextInt();
        sc.close();
        for(i=0;i<n;i++)
        {
            if(s==e[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.printf("Element %d is found at index %d\n",s,i);
        }
        else 
        {
            System.out.printf("Element %d doesn't exists\n",s);
        }
    }
}
