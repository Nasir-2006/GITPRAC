import java.util.Scanner;
public class StringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String line = sc.nextLine();
        System.out.println("Enter target character:");
        char target = sc.next().charAt(0);
        boolean res = search(line, target);
        System.out.println(res);

    }
    static boolean search(String str,char target)
    {
        if(str.length() == 0)
        {
            return false;
        }
        
        for (int i = 0;i<=str.length();i++)
        {
            if(str.charAt(i) == target)
            {
                
                return true;
            }
        }
        return false;
        
    }
}
