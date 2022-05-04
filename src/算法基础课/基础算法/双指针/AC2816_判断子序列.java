package 算法基础课.基础算法.双指针;

import java.util.*;

/**
 * @author CWB
 * @date 2022/5/4
 * @apiNote
 */
public class AC2816_判断子序列 {


    static int N = 100010;
    static int[] a = new int[N], b = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        boolean res = true;
        for (int i = 0, j = 0; i < n; i++, j++) {
            while (j < m && b[j] != a[i]) j++;
            if (j == m && i != n) {
                res = false;
                break;
            }
        }
        if (res) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
