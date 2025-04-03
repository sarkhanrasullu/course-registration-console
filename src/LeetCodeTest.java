import java.util.Scanner;

public class LeetCodeTest {
    public static void main2(String[] args) {
        System.out.println("enter number:");
        String number = new Scanner(System.in).nextLine();
        System.out.println(reverse(number));
    }

    public static boolean reverse(String number) {
        int left =0;
        int right = number.length()-1;
        while(left<right) {
            if(number.charAt(left)!=number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
