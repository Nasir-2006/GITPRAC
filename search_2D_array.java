import java.util.Scanner;
public class search_2D_array {
    static boolean search(int[][] arr,int target)
    {
        for(int rows = 0;rows< arr.length;rows++)
        {
            for (int col = 0;col < arr[rows].length;col++)
            {
                if(arr[rows][col] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows :");
        int rows = sc.nextInt();
        System.out.println("Enter Columns:");
        int col = sc.nextInt();

        System.out.println("Enter Elements:");

        int[][] arr = new int[rows][col];
        for(int i = 0;i < arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter target Element:");
        int target = sc.nextInt();
        boolean res = search(arr,target);
        System.out.println(res);
    }
}
