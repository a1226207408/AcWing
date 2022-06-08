package 算法基础课.数据结构.队列;

import java.util.*;

public class AC829_模拟队列 {


    static int N = 100010;
    static int[] q = new int[N];
    static int h = 0, t = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-- > 0) {
            String op = sc.next();
            if (op.equals("push")) {
                int x = sc.nextInt();
                q[++t] = x;
            } else if (op.equals("pop")) {
                h++;
            } else if (op.equals("empty")) {
                if (t >= h) System.out.println("NO");
                else System.out.println("YES");
            } else {
                System.out.println(q[h]);
            }
        }
    }
}
