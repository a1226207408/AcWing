package 算法基础课.数据结构.双链表;

import java.util.*;

public class AC827_双链表 {
    static int N = 100010;
    static int[] l = new int[N], r = new int[N], e = new int[N];
    static int idx;

    static void init() {
        r[0] = 1;
        l[1] = 0;
        idx = 2;
    }

    static void add(int k, int x) {
        e[idx] = x;
        l[idx] = k;
        r[idx] = r[k];
        l[r[k]] = idx;
        r[k] = idx;
        idx++;
    }

    static void del(int k) {
        l[r[k]] = l[k];
        r[l[k]] = r[k];
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-- > 0) {
            String op = sc.next();
            if (op.equals("L")) {
                int x = sc.nextInt();
                add(0, x);
            } else if (op.equals("R")) {
                int x = sc.nextInt();
                add(l[1], x);
            } else if (op.equals("IL")) {
                int k = sc.nextInt();
                int x = sc.nextInt();
                add(l[k + 1], x);
            } else if (op.equals("IR")) {
                int k = sc.nextInt();
                int x = sc.nextInt();
                add(k + 1, x);
            } else {
                int k = sc.nextInt();
                del(k + 1);
            }
        }
        for (int i = r[0]; i != 1; i = r[i]) System.out.print(e[i] + " ");
    }
}
