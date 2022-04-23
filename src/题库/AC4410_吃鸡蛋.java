package 题库;

import java.util.Scanner;

/**
 * @author CWB
 * @date 2022/4/23
 * @apiNote
 */
public class AC4410_吃鸡蛋 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int day = 0;
        while(n > 0 ){
            day++;
            if(n==0) break;
            if(day % m == 0) n++;
            n--;
        }
        System.out.println(day);
    }
}
