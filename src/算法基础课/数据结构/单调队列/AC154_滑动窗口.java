package 算法基础课.数据结构.单调队列;

import java.util.*;
import java.io.*;

public class AC154_滑动窗口 {

    static int N = 1000010;
    static int[] a = new int[N], q = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(line[i]);
        }

        int h = 0, t = -1;
        for (int i = 0; i < n; i++) {
            if (t >= h && i - k + 1 > q[h]) h++;
            while (t >= h && a[q[t]] >= a[i]) t--;
            q[++t] = i;
            if (i >= k - 1) System.out.print(a[q[h]] + " ");
        }

        System.out.println();
        h = 0;
        t = -1;
        for (int i = 0; i < n; i++) {
            if (t >= h && i - k + 1 > q[h]) h++;
            while (t >= h && a[q[t]] <= a[i]) t--;
            q[++t] = i;
            if (i >= k - 1) System.out.print(a[q[h]] + " ");
        }
    }
}
