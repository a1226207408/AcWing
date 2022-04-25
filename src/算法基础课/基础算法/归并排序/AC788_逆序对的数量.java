package 算法基础课.基础算法.归并排序;

import java.util.*;

/**
 * @author CWB
 * @date 2022/4/25
 * @apiNote
 */
public class AC788_逆序对的数量 {

    static int N = 100010;
    static int[] tmp = new int[N];
    static int[] q = new int[N];

    static long mergeSort(int l, int r) {
        if (l >= r) return 0;
        int mid = l + r >> 1;

        long res = mergeSort(l, mid) + mergeSort(mid + 1, r);
        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) tmp[k++] = q[i++];
            else {
                tmp[k++] = q[j++];
                res += mid - i + 1;
            }
        }
        while (i <= mid) tmp[k++] = q[i++];
        while (j <= r) tmp[k++] = q[j++];

        for (i = l, j = 0; i <= r; i++, j++) q[i] = tmp[j];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) q[i] = sc.nextInt();
        System.out.println(mergeSort(0, n - 1));
    }
}
