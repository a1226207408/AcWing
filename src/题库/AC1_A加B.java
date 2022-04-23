package 题库;

import java.util.Scanner;

/**
 * @author CWB
 * @date 2022/4/22
 * @apiNote
 */
public class AC1_A加B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        while (sc.hasNext())
            res += sc.nextInt();
        System.out.print(res);
    }
}
