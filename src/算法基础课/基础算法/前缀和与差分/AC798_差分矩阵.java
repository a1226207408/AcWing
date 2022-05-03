package 算法基础课.基础算法.前缀和与差分;

import java.util.*;

/**
 * @author CWB
 * @date 2022/5/3
 * @apiNote
 */
public class AC798_差分矩阵 {

    static int N = 1010;
    static int[][] a = new int[N][N], b = new int[N][N];

    static void insert(int x1, int y1, int x2, int y2, int c) {
        b[x1][y1] += c;
        b[x1][y2 + 1] -= c;
        b[x2 + 1][y1] -= c;
        b[x2 + 1][y2 + 1] += c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++) {
                a[i][j] = sc.nextInt();
                insert(i, j, i, j, a[i][j]);
            }

        while (q-- > 0) {
            int x1, y1, x2, y2, c;
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            c = sc.nextInt();
            insert(x1, y1, x2, y2, c);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                b[i][j] += b[i - 1][j] + b[i][j - 1] - b[i - 1][j - 1];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


    }
}
