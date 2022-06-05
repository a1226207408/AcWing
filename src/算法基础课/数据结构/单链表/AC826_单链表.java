package 算法基础课.数据结构.单链表;

import java.util.*;

public class AC826_单链表 {
    static int N = 100010;
    static int[] e = new int[N], ne = new int[N];
    static int head = -1;
    static int idx = 0;

    static void addToHead(int x) {
        e[idx] = x;
        ne[idx] = head;
        head = idx++;
    }

    static void add(int x, int k) {
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx++;
    }

    static void del(int k) {
        ne[k] = ne[ne[k]];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-- > 0) {
            String op = sc.next();
            if (op.equals("H")) {
                int x = sc.nextInt();
                addToHead(x);
            } else if (op.equals("D")) {
                int k = sc.nextInt();
                if (k == 0) head = ne[head];
                else del(k - 1);
            } else {
                int k = sc.nextInt();
                int x = sc.nextInt();
                add(x, k - 1);
            }
        }

        for (int i = head; i != -1; i = ne[i]) System.out.print(e[i] + " ");
    }
}
