import java.util.Scanner;
public class GNOUT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr elements:");
        int num = sc.nextInt();
        char[] arr = new char[num];
        for(int  i = 0;i<arr.length;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("Enter target Element:");
        char target = sc.next().charAt(0);
        int res = Smallest_Number_Greater_than_target(arr,target);
        System.out.println(arr[res]);
    }
    static int Smallest_Number_Greater_than_target(char[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(target>=arr[mid])
            {
                start  = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return start%arr.length;
    }
}
