package 题库;

import java.util.Scanner;

/**
 * @author CWB
 * @date 2022/4/23
 * @apiNote
 */
public class AC4411_三仙归洞 {
    static int[] q = new int[]{0,1,2};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        n %= 6;
        for(int i = 1;i<=n;i++){
            if(i%2==1) swap(0,1);
            else swap(1,2);
        }
        System.out.println(q[x]);
    }
    static void swap(int a,int b){
        int t = q[a];
        q[a] = q[b];
        q[b] = t;
    }
}
