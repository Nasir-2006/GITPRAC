import java.util.Arrays;
import java.util.Scanner;
public class first_and_last {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of array Elements:");
        int num = sc.nextInt();
        System.out.println("Enter Elements:");
        int[] arr = new int[num];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target:");
        int target = sc.nextInt();

        int[] res = search(arr, target);
        System.out.println("Answer: " + Arrays.toString(res));
        
    }
    public static int[] search(int[] arr,int target)
    {
        int[] ans = {-1,-1};
        int start =search(arr, target,false);
        int end = search(arr, target,true);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] arr,int target,boolean first)
    {
        int ans =-1;
        int start =0;
        int end = arr.length-1;
        for(int i=start;i<end;i++)
        {
            int mid = start+(end-start)/2;
            if(target>arr[mid])
            {
                start = mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                ans = mid;
                if(first)
                {
                    start = mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return ans;
    }
}