import java.util.Scanner;
public class LINEAR_SEARCH {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Element:");
        int elmnt = sc.nextInt();
        System.out.println("Enter array Elements:");
        int[] arr = new int[elmnt];
         for(int i = 0 ; i < arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("-------------------");
        System.out.println("Enter Start range:");
        int start  = sc.nextInt();
        System.out.println("Enter End range:");
        int end  = sc.nextInt();
       
        System.out.println("Enter number you want to Search:");
        int search = sc.nextInt();
        boolean isfound = false;
        for(int j = start;j<=end;j++)
        {
            // System.out.println(arr);
            if(search == arr[j])
            {
                isfound = true;
                System.out.println("Yes! number found is it:"+search+" at index "+j);
                break;
            }
           
        }
        if(isfound == false) {
            System.out.println("Number does not exist.");
        }
    }
}
