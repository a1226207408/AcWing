package 算法基础课.数据结构.栈;

import java.util.*;

public class AC828_模拟栈 {

    static int N = 100010;
    static int[] stk = new int[N];
    static int p = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-- > 0) {
            String op = sc.next();
            if (op.equals("push")) {
                int x = sc.nextInt();
                stk[++p] = x;
            } else if (op.equals("pop")) {
                p--;
            } else if (op.equals("empty")) {
                if (p > 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println(stk[p]);
            }
        }
    }
}
