package 题库;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author CWB
 * @date 2022/4/30
 * @apiNote
 */
public class AC4414_子序列 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().split(" ")[0]);
        String[] line = br.readLine().split(" ");
        int t1 = Integer.MIN_VALUE, t2 = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            int t = Integer.parseInt(line[i]);
            if(t > 0){
                sum += t;
                if(t % 2 != 0) t2 = Math.min(t2, t);
            }else{
                if(t % 2 != 0) t1 = Math.max(t1, t);
            }
        }

        if(sum % 2 == 0){
            sum = Math.max(sum + t1, sum - t2);
        }
        System.out.println(sum);
    }
}
