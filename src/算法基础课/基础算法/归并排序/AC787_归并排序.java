package 算法基础课.基础算法.归并排序;

import java.util.*;

/**
 * @author CWB
 * @date 2022/4/25
 * @apiNote
 */
public class AC787_归并排序 {

    static int N = 100010;
    static int[] tmp = new int[N];

    static void mergeSort(int[] q, int l, int r) {
        if (l >= r) return;
        int mid = l + r >> 1;

        mergeSort(q, l, mid);
        mergeSort(q, mid + 1, r);

        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) tmp[k++] = q[i++];
            else tmp[k++] = q[j++];
        }
        while (i <= mid) tmp[k++] = q[i++];
        while (j <= r) tmp[k++] = q[j++];

        for (i = l, j = 0; i <= r; i++, j++) q[i] = tmp[j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        mergeSort(q, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(q[i] + " ");
        }
    }
}
