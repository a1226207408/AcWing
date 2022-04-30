package 题库;

import java.util.Scanner;

/**
 * @author CWB
 * @date 2022/4/30
 * @apiNote
 */
public class AC4413_组队 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            if(t + k <= 5) count++;
        }
        System.out.println(count / 3);

    }
}
