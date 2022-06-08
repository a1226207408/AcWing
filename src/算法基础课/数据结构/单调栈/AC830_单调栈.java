package 算法基础课.数据结构.单调栈;

import java.util.*;

public class AC830_单调栈 {

    static int N = 100010;
    static int[] stk = new int[N];
    static int t = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            while (t > 0 && stk[t] >= x) t--;
            if (t > 0) System.out.print(stk[t] + " ");
            else System.out.print("-1 ");

            stk[++t] = x;
        }
    }
}
