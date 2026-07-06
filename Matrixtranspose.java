import java.util.*;
public class Matrixtranspose
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter rows and columns");
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] m1 = new int[r][c];
        System.out.println("Enter elements to matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }
        sc.close(); 
        System.out.println("Before Transpose:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.printf("%3d",m1[i][j]);
            }
            System.out.println();
        }
        System.out.println("After Transpose:");
        for(int j=0;j<c;j++)
        {
            for(int i=0;i<r;i++)
            {
                System.out.printf("%3d",m1[i][j]);
            }
            System.out.println();
        }

    }
}
