import java.util.Scanner;
import java.util.Arrays;
public class Selection_sort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of array element:");
       int num = sc.nextInt();
       System.out.println("Enter array elements:");
       int[] arr = new int[num];
       for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt(); 
        } 
        selectionsort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static void selectionsort(int[] arr)
    {
        
        for(int i =0;i<arr.length-1;i++)
        {
            int minindex = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }
                arr[minindex] =  arr[minindex]+arr[j]-(arr[j] = arr[minindex]);
            }
        }
    }
}
