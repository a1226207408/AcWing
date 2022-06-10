package 算法基础课.数据结构.KMP;

import java.util.*;
import java.io.*;

public class AC831_KMP字符串 {


    static int N = 100010;
    static int[] ne = new int[N];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        String s1 = " " + sc.next();
        char[] p = s1.toCharArray();
        int m = sc.nextInt();
        String s2 = " " + sc.next();
        char[] s = s2.toCharArray();

        for (int i = 2, j = 0; i <= n; i++) {
            while (j != 0 && p[i] != p[j + 1]) j = ne[j];
            if (p[i] == p[j + 1]) j++;
            ne[i] = j;
        }

        for (int i = 1, j = 0; i <= m; i++) {
            while (j != 0 && s[i] != p[j + 1]) j = ne[j];
            if (s[i] == p[j + 1]) j++;
            if (j == n) {
                j = ne[j];
                bw.write(i - n + " ");
            }
        }
        bw.flush();
    }
}
