package 算法基础课.基础算法.快速排序;

import java.io.*;

/**
 * @author CWB
 * @date 2022/4/23
 * @apiNote
 */
public class AC786_第K个数 {
    static int[] q;

    static int quickSort(int l, int r, int k) {
        if (l >= r) return q[l];
        int x = q[l + r >> 1], i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) {
                int t = q[i];
                q[i] = q[j];
                q[j] = t;
            }
        }
        int sl = j - l + 1;
        if (k <= sl) return quickSort(l, j, k);
        return quickSort(j + 1, r, k - sl);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        q = new int[n];
        line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            q[i] = Integer.parseInt(line[i]);
        }
        System.out.println(quickSort(0, n - 1, k));
    }
}
