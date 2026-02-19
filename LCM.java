import java.util.Scanner;
class LCM{
    static int HCF(int num1,int num2)
        {
            while(num2!=0)
            {
                int temp = num1%num2;
                num1 = num2;
                num2 = temp;
            }
            return num1;
        }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num1:");
    int num1 = sc.nextInt();
    System.out.println("Enter num2:");
    int num2 = sc.nextInt();
    int rem = HCF(num1, num2);
    int lcm = (num1*num2)/rem;
    System.out.println(lcm);
}
}