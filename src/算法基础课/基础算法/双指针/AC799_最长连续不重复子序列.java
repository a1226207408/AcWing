package 算法基础课.基础算法.双指针;

import java.util.*;

/**
 * @author CWB
 * @date 2022/5/4
 * @apiNote
 */
public class AC799_最长连续不重复子序列 {

    static int N = 100010;
    static int[] a = new int[N], s = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int res = 0;
        for (int i = 0, j = 0; i < n; i++) {
            s[a[i]]++;
            while (s[a[i]] > 1) {
                s[a[j]]--;
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        System.out.println(res);
    }
}
