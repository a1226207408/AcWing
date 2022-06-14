package 算法基础课.数据结构.Trie;

import java.io.*;

public class AC143_最大异或对 {

    static int N = 100010, M = 4000000;
    static int[][] son = new int[M][2];
    static int[] a = new int[N];
    static int idx = 0;

    static void insert(int x) {
        int p = 0;
        for (int i = 30; i >= 0; i--) {
            if (son[p][x >> i & 1] == 0) son[p][x >> i & 1] = ++idx;
            p = son[p][x >> i & 1];
        }
    }

    static int query(int x) {
        int p = 0, res = 0;
        for (int i = 30; i >= 0; i--) {
            int s = x >> i & 1;
            int sp = s == 0 ? 1 : 0;
            if (son[p][sp] != 0) {
                res += 1 << i;
                p = son[p][sp];
            } else p = son[p][s];
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(line[i]);
            insert(a[i]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) res = Math.max(res, query(a[i]));

        System.out.println(res);
    }

}
