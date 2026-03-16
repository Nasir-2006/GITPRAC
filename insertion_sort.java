import java.util.Scanner;
import java.util.Arrays;
public class insertion_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of array elemnet:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr)
    {

        for(int i = 1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}