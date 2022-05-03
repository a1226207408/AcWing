package 算法基础课.基础算法.前缀和与差分;

import java.util.*;

/**
 * @author CWB
 * @date 2022/5/3
 * @apiNote
 */
public class AC797_差分 {

    static int N = 100010;
    static int[] a = new int[N];
    static int[] b = new int[N];

    static void insert(int l, int r, int c) {
        b[l] += c;
        b[r + 1] -= c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            //构造差分数组
            insert(i, i, a[i]);
        }

        while (m-- > 0) {
            int l, r, c;
            l = sc.nextInt();
            r = sc.nextInt();
            c = sc.nextInt();
            insert(l, r, c);
        }
        //构造前缀和数组
        for (int i = 1; i <= n; i++) {
            b[i] += b[i - 1];
            System.out.print(b[i] + " ");
        }

    }
}
