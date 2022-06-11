package 算法基础课.数据结构.Trie;

import java.util.*;

public class AC835_Trie字符串统计 {


    static int N = 100010;
    static int[][] son = new int[N][26];
    static int[] cnt = new int[N];
    static int idx = 0;

    static void insert(String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if (son[p][u] == 0) son[p][u] = ++idx;
            p = son[p][u];
        }
        cnt[p]++;
    }

    static int query(String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if (son[p][u] == 0) return 0;
            p = son[p][u];
        }
        return cnt[p];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String op = sc.next();
            if (op.equals("I")) {
                String s = sc.next();
                insert(s);
            } else {
                String s = sc.next();
                int res = query(s);
                System.out.println(res);
            }
        }
    }
}
