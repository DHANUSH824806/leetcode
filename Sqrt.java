//This is the Solution for the LeetCode problem 69
import java.util.*;
class Sqrt {
    public static int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == x / mid) {
                return mid;
            } 
            else if (mid < x / mid) {
                ans = mid;   // possible answer
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(mySqrt(n));
    }
}