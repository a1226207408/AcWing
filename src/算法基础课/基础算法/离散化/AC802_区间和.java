package 算法基础课.基础算法.离散化;

import java.util.*;

/**
 * @author CWB
 * @date 2022/5/6
 * @apiNote
 */
public class AC802_区间和 {
    static int N = 300010;
    static int[] a = new int[N], s = new int[N];
    static List<Integer> alls = new ArrayList<>();
    static List<Pair> adds = new ArrayList<>();
    static List<Pair> querys = new ArrayList<>();

    static int unique(List<Integer> list) {
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || !list.get(i).equals(i - 1)) {
                list.set(j, list.get(i));
                j++;
            }
        }
        return j;
    }

    static int find(int x, List<Integer> list) {
        int l = 0, r = list.size() - 1;
        int mid = l + r >> 1;
        while (l < r) {
            if (list.get(mid) >= x) r = mid;
            else l = mid + 1;
        }
        return l + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int c = sc.nextInt();
            adds.add(new Pair(x, c));
            alls.add(x);
        }

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            querys.add(new Pair(l, r));
            alls.add(l);
            alls.add(r);
        }

        Collections.sort(alls);
        int tail = unique(alls);
        alls = alls.subList(0, tail);

        for (Pair p : adds) {
            int index = p.first;
            a[index] += p.second;
        }

        for (int i = 1; i < alls.size(); i++) {
            s[i] = s[i - 1] + a[i];
        }
        for (Pair p : querys) {
            int l = p.first;
            int r = p.second;
            System.out.println(s[r] - s[l - 1]);
        }
    }


    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
