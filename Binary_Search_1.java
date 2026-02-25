import java.util.Scanner;
public class Binary_Search_1 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter N.O.E:");
      int num = sc.nextInt();
      System.out.println("Enter Elements:");
      int[] arr = new int[num];
      for(int i = 0;i<arr.length;i++)
      {
        arr[i] = sc.nextInt();
      }
       System.out.println("Enter target element:");
       int target = sc.nextInt();
      int res = BS1(arr,target);
      System.out.println(res);
    }
    static int BS1(int[] arr,int target)
    {
        int start  = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end  = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}