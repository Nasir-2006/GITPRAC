import java.util.Arrays;
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        for(int i =0;i<arr.length;i++)
        {
            for(int j =1;j<arr.length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    arr[j-1] = arr[j-1]+arr[j]-(arr[j]=arr[j-1]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}