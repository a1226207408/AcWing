package 算法基础课.基础算法.快速排序;

import java.io.*;

/**
 * @author CWB
 * @date 2022/4/23
 * @apiNote
 */
public class AC785_快速排序 {
    static void quickSort(int[] q, int l, int r) {
        if (l >= r) return;
        int x = q[l + r >> 1], i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) swap(q, i, j);
        }
        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }

    static void swap(int[] q, int a, int b) {
        int t = q[a];
        q[a] = q[b];
        q[b] = t;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] q = new int[n];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            q[i] = Integer.parseInt(line[i]);
        }
        quickSort(q, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(q[i] + " ");
        }
    }
}
