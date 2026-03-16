import java.util.Scanner;
public class infintyloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,5,7,9,11,12,14,15,17,20,24,28,30};
        System.out.println("Enter target:");
        int target = sc.nextInt();
        System.out.println("Target is at index:"+range(arr,target));       
}
static int range(int[] arr,int target)
{
    int start = 0;
    int end = 1;
    while(target>arr[end])
    {
        int nstart = end+1;//kyun k jab agla chunch tab hi start hoa he jab pichle end me +1 kia he
        end = start+(end-start+1)*2;
        start = nstart;
    }
    return binary(arr, target, start, end);
}
static int binary(int[] arr,int target,int start,int end)
{
    while(start<=end)
    {
        int mid = start+(end-start)/2;
        if(target>arr[mid])
        {
            start = mid+1;
        }
        else if(target<arr[mid])
        {
            end = mid-1;
        }
        else
        {
            return mid;
        }
    }
    return -1;
}
}
