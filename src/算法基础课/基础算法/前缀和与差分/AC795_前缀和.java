package 算法基础课.基础算法.前缀和与差分;

import java.io.*;

/**
 * @author CWB
 * @date 2022/4/22
 * @apiNote
 */
public class AC795_前缀和 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int sz = Integer.parseInt(line[0]);
        int query = Integer.parseInt(line[1]);
        int[] a = new int[sz];
        line = br.readLine().split(" ");
        for(int i=0;i<sz;i++){
            a[i] = Integer.parseInt(line[i]);
        }
        int[] s = new int[sz+1];
        for(int i=1;i<s.length;i++){
            s[i] = s[i-1] + a[i-1];
        }
        while(query-- > 0){
            line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            System.out.println(s[y] - s[x-1]);
        }
    }
}
