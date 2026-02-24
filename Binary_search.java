import java.util.Scanner;
public class Binary_search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements:");
        int num = sc.nextInt();
        System.out.println("Enter array Elements:");
        int[] arr = new int[num];
        for(int i=0 ;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Numbers with EVEN Digits: "+NOD(arr));
    }
    static int NOD(int[] arr)
    {
       int num = 0;
        for(int i = 0;i<arr.length;i++)
        {   
        int count =  (int)(Math.log10(arr[i])+1);
        if(count%2==0)
        {
            num++;
        }
    }
        return num;
}
}