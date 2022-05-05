package 算法基础课.基础算法.位运算;

import java.util.*;

/**
 * @author CWB
 * @date 2022/5/5
 * @apiNote
 */
public class AC801_二进制中1的个数 {


    static int lowbit(int n) {
        return n & -n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int num = sc.nextInt();
            int res = 0;
            while (num != 0) {
                num -= lowbit(num);
                res++;
            }
            System.out.print(res + " ");
        }
    }
}
