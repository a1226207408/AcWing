package 算法基础课.基础算法.二分;
import java.util.*;
/**
 * @author CWB
 * @date 2022/4/28
 * @apiNote
 */
public class AC789_数的范围 {
    static int[] q;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int query = sc.nextInt();
        q = new int[n];
        for(int i = 0; i < n; i++) q[i] = sc.nextInt();
        while(query-- > 0){
            int l = 0, r = n - 1;
            int x = sc.nextInt();
            while(l < r){
                int mid = l + r >> 1;
                if(q[mid] >= x) r = mid;
                else l = mid + 1;
            }

            if(q[l] != x) System.out.println("-1 -1");
            else{
                System.out.print(l);
                l = 0; r = n - 1;
                while(l < r){
                    int mid = l + r + 1 >> 1;
                    if(q[mid] <= x) l = mid;
                    else r = mid - 1;
                }
                System.out.print(" " + l + "\n");
            }

        }
    }
}
