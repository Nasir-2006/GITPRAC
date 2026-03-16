import java.util.Scanner;
public class Binary_Ceiling {
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
        int start = 0;
        int end = arr.length-1;
        boolean  asc = arr[start]<arr[end];
        for(int i = start;i<end;i++)
            {
                int mid  = start + (end-start)/2;
                if(asc)
                {
                    if(target>arr[mid])
                    {
                        start = mid+1;
                    }
                    else{
                        end = mid -1;
                    }
                    System.out.println("The ceiling number is: "+arr[start]);//agar floor find karna ho to sirf arr[end] kar dena
                }
                else
                {
                    if(target>arr[mid])
                    {
                        end = mid - 1;
                    }
                    else
                    {
                       start = mid+1;
                    }
                    System.out.println("The ceiling number is: "+arr[start]);//agar floor find karna ho to sirf arr[end] kar dena
                }

            } 
            sc.close();
    }
}
